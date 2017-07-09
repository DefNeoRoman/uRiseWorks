package sandbox.winterCounter;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //Каждое измерение зимы меньше чем каждое измерение лета
        //Темература идет вниз?
        //если да, то продолжаем
        //если вверх, то это число больше чем все предыдущие?
        //если нет продолжаем
        //если да то возвращаем количество измерений в зиме
        int[]ints = {1,2,-3,-5,-6,4,6,8,5,10,15};
        Solution solution = new Solution();
        System.out.println(solution.solution(ints));
    }
    public int solution(int[] t){
      final  int result;
      List<Integer> ints = new ArrayList<>();
      for (int a:t){
          ints.add(a);
      }
      List<Integer> winterLength = new ArrayList<>();

      ints.forEach(element-> {
          if(winterLength.size()==0){
              winterLength.add(element);

          }else{
              if(element <= winterLength.get(winterLength.size()-1)){
                  winterLength.add(element);
              }
              else{
                  boolean isWinter=false;
                  int counter =0;
                  for(Integer i:winterLength){
                      if(element>i && winterLength.size()>1){
                          counter++;
                      }
                  }
                  if(counter == winterLength.size()){
                      isWinter = true;
                  }if(!isWinter){
                      winterLength.add(element);
                  }


              }
          }

      });
      return winterLength.size();
    }

}
