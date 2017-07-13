package sandbox.formatPhoneNumber;

import java.util.ArrayList;
import java.util.List;

//Нам дана строка s, представляющая собой номер телефона, который мы хотели бы переформатировать. Строка s, состоящая
//        из N символов: цифр, пробелов и/или тире. Он содержит не менее двух цифр.
//
//        Пробелы и прочерки в строке s можно пренебречь. Мы хотим переформатировать
//        дали номер телефона таким образом, что цифры группируются в блоки длиной три, разделенных одиночными перебежками.
//        При необходимости последний блок или последние два блока могут быть длины двух.
//
//        Например, дана строка s = "00-44 48 5555 8361", мы хотели бы, чтобы отформатировать его как "004-448-555-583-61".
//
//        Написать функцию:
//
//        решение класса { решение публичных строку(строку s); }
//
//        , что задана строка s, представляющая номер телефона, возвращает этот номер телефона переформатирован, как описано выше.
//
//        Например, учитывая = "00-44 48 5555 8361", функция должна возвращать "004-448-555-583-61".
//        Учитывая = "0 - 22 1985--324", функция должна возвращать "022-198-53-24". Учитывая = "555372654",
//        функция должна возвращать "555-372-654".
//
//        Предположим, что:
//          123-232-32;
//        N представляет собой целое число в диапазоне [2..100]; строка s состоит только из цифр (0-9), пробелов и/или дефисы (-);
//        строка s содержит по крайней мере две цифры. В решении, сосредоточиться на правильности. Производительность вашего решения не являются объектом оценки.
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("00-4490 48 555 8345 69"));
    }
    public String solution(String S){
        String work =  S.replaceAll("[\\s\\-]+","");
        char[] chars = work.toCharArray();
        List<Integer> li = new ArrayList<>();
        for(char c:chars){
            li.add(Integer.parseInt(Character.toString(c)));
        }
        if(li.size() <3 && li.size()<100){
            return "not in range";
        }
        StringBuilder sb = new StringBuilder();
        int param = li.size()%3;

        for(int i=0; i<li.size(); i++){
            if(i%3 == 0 && i!=0 && i!=li.size()-1){
                 sb.append("-");
            }
            if(param == 1 && i == li.size()-2){
                sb.append("-");
            }
            sb.append(li.get(i));
        }
        return sb.toString();
    }
}
