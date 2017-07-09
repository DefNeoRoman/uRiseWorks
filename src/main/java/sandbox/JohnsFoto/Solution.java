package sandbox.JohnsFoto;
//String expected = "Warsaw02.jpg\n" +
//        "London1.png\n" +
//        "Warsaw01.png\n" +
//        "Paris2.jpg\n" +
//        "Paris1.jpg\n" +
//        "London2.jpg\n" +
//        "Paris3.png\n" +
//        "Warsaw03.jpg\n" +
//        "Warsaw09.png\n" +
//        "Warsaw07.jpg\n" +
//        "Warsaw06.jpg\n" +
//        "Warsaw08.jpg\n" +
//        "Warsaw04.png\n" +
//        "Warsaw05.png\n" +
//        "Warsaw10.jpg";
//
//        String input = "photo.jpg, Warsaw, 2013-09-05 14:08:15\n" +
//        "john.png, London, 2015-06-20 15:13:22\n" +
//        "myFriends.png, Warsaw, 2013-09-05 14:07:13\n" +
//        "Eiffel.jpg, Paris, 2015-07-23 08:03:02\n" +
//        "pisatower.jpg, Paris, 2015-07-22 23:59:59\n" +
//        "BOB.jpg, London, 2015-08-05 00:02:03\n" +
//        "notredame.png, Paris, 2015-09-01 12:00:00\n" +
//        "me.jpg, Warsaw, 2013-09-06 15:40:22\n" +
//        "a.png, Warsaw, 2016-02-13 13:33:50\n" +
//        "b.jpg, Warsaw, 2016-01-02 15:12:22\n" +
//        "c.jpg, Warsaw, 2016-01-02 14:34:30\n" +
//        "d.jpg, Warsaw, 2016-01-02 15:15:01\n" +
//        "e.png, Warsaw, 2016-01-02 09:49:09\n" +
//        "f.png, Warsaw, 2016-01-02 10:55:32\n" +
//        "g.jpg, Warsaw, 2016-02-29 22:13:11";

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(
     "photo.jpg, Warsaw, 2013-09-05 14:08:15\n" +
        "john.png, London, 2015-06-20 15:13:22\n" +
        "myFriends.png, Warsaw, 2013-09-05 14:07:13\n" +
        "Eiffel.jpg, Paris, 2015-07-23 08:03:02\n" +
        "pisatower.jpg, Paris, 2015-07-22 23:59:59\n" +
        "BOB.jpg, London, 2015-08-05 00:02:03\n" +
        "notredame.png, Paris, 2015-09-01 12:00:00\n" +
        "me.jpg, Warsaw, 2013-09-06 15:40:22\n" +
        "a.png, Warsaw, 2016-02-13 13:33:50\n" +
        "b.jpg, Warsaw, 2016-01-02 15:12:22\n" +
        "c.jpg, Warsaw, 2016-01-02 14:34:30\n" +
        "d.jpg, Warsaw, 2016-01-02 15:15:01\n" +
        "e.png, Warsaw, 2016-01-02 09:49:09\n" +
        "f.png, Warsaw, 2016-01-02 10:55:32\n" +
        "g.jpg, Warsaw, 2016-02-29 22:13:11"));
    }
    public String solution (String s){
        String afterReplacing = s.replace("\n",", ");
        String[] afterSplitting = afterReplacing.split(",");
        List<String> workList = Arrays.asList(afterSplitting);
        List<String> names = new ArrayList<>();
        List<String> dates = new ArrayList<>();
        List<String> cities = new ArrayList<>();

        workList.forEach(element-> {
            if(element.contains(":")){
                dates.add(element.substring(1));
            }else if (element.contains(".")){
                names.add(element);
            }else{
                cities.add(element);
            }
        });
      List<Foto> listFoto = new ArrayList<>();
      for (int i=0; i<cities.size(); i++){
          listFoto.add(new Foto(names.get(i),dates.get(i),cities.get(i)));
      }
        System.out.println(listFoto);
        return "";
    }
  }
