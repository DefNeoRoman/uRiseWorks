package answersToInterview.teleoffice;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
   public static void main(String[] args) {
        String s =
                "1.01.2017 09:00 :: 1.01.2017 09:45\n" + //0    1
                "\n" +
                "1.01.2017 10:00 :: 2.01.2017 12:45\n" + // 26  2
                "\n" +
                "1.01.2017 10:30 :: 2.01.2017 12:45\n" + // 25  3
                "\n" +
                "1.01.2017 11:00 :: 2.01.2017 12:45\n" + // 25  4
                "\n" +
                "1.01.2017 11:30 :: 2.01.2017 12:45\n" + // 24  5
                "\n" +
                "1.01.2017 12:00 :: 2.01.2017 12:45\n" + // 24  6
                "\n" +
                "1.01.2017 13:00 :: 2.01.2017 12:45\n" + // 23 7
                "\n" +
                "1.01.2017 13:30 :: 2.01.2017 12:45\n" + // 22 8
                "\n" +
                "1.01.2017 14:00 :: 2.01.2017 12:45\n" + // 21 9
                "\n" +
                "1.01.2017 14:30 :: 2.01.2017 12:45\n" + // 21 10
                "\n" +
                "1.01.2017 14:57 :: 3.01.2017 16:35\n" +// 49 11
                "\n" +
                "1.01.2017 15:00 :: 3.01.2017 16:35\n" +// 49 12
                "\n" +
                "1.01.2017 15:30 :: 3.01.2017 16:35";   // 49 13



        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");


        String[] intermediate = s.split("\n\n");
        List<String> starts = new ArrayList<>();
        List<String> ends = new ArrayList<>();
        for(int j=0; j<intermediate.length; j++){
            String [] inter2 = intermediate[j].split("::");
            starts.add(inter2[0]);
            ends.add(inter2[1]);
        }
        Map<Integer,Integer> interResultMap = new HashMap<>();
       List<Map<Integer,Integer>> listOfResultMap = new ArrayList<>();
        List<String> starts2 = stringHelper(starts);
        List<String> ends2 = stringHelper(ends);
        for(int k = 0; k < starts2.size(); k++){
            LocalDateTime start = LocalDateTime.parse(starts2.get(k), formatter);
            if(start.getMinute() != 0){
                continue;
            }
            LocalDateTime end = LocalDateTime.parse(ends2.get(k), formatter);
            int resDay = end.getDayOfMonth() - start.getDayOfMonth();
            int resHour = end.getHour() - start.getHour();
            int result = resDay*24 + resHour;
            interResultMap.put(k,result);
            
        }
     }

    public static List<String> stringHelper(List<String> withoutZero){
        List<String> result = new ArrayList<>();
        for (int i=0; i<withoutZero.size(); i++){
            String toAdd = withoutZero.get(i).trim();
            char condition = withoutZero.get(i).charAt(0);
            if(condition < 59){
            result.add("0"+toAdd);
            }else {
                result.add(toAdd);
            }
        }
        return result;
    }
}
