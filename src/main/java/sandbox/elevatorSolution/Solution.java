package sandbox.elevatorSolution;

import java.util.Arrays;

//A - это массив веса каждого человека
//B - это целевой этаж каждого человека
//M - это количество этажей
//X - лимит человеков
//Y - лимит веса
// Написать функцию, которая возвращает количество остановок лифта
// Каждый элемент массива A является целым числом в пределах диапазона [1..Y];
// Каждый элемент массива B является целым числом в диапазоне [1..M]
// M = 3, X = 2, Y = 200
//        A [0] = 40 B [0] = 3
//        A [1] = 40 B [1] = 3
//        A [2] = 100 B [2] = 2
//        A [3] = 80 B [3] = 2
//        A [4] = 20 B [4] = 3
// порядок этажей менять нельзя ->3 ->2 ->1 ->2 ->3 ->1
public class Solution {
    public static void main(String[] args) {
        int[] weights = {40, 40, 100, 80, 20, 200,150};
        int[] floors = {3, 3, 2, 2, 3, 4,7};
        int countFloors = 3;
        int capacityElevator = 3;
        int weightLimit = 200;
        Solution solution = new Solution();
        System.out.println(solution.solution(weights, floors, countFloors, capacityElevator, weightLimit));
    }
    public int solution(int[] A, int[] B, int M, int X, int Y) {
        int summaryWeight = 0;
        int counter = 0;
        int humans = 0;
        int currentFloor = 0;
        int elevatorStops = 0;
       while(summaryWeight<=Y && humans < X+1 && (counter < B.length)){
           humans++;
           summaryWeight += A[counter];
           currentFloor = B[counter];
           if(summaryWeight > Y){
               summaryWeight = 0;
               humans = 0;
               elevatorStops++;

               counter++;

           } else if(currentFloor != B[counter]){
               elevatorStops++;
               counter++;
           }else{
               counter++;
           }

           if(humans == X){
               humans = 0;
               summaryWeight = 0;
               elevatorStops++;
           }

       }
        return elevatorStops;
    }

}

