package sandbox.elevatorSolution;

import java.util.HashSet;
import java.util.Set;

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
        int capacityElevator = 2;
        int weightLimit = 200;
        Solution solution = new Solution();
        System.out.println(solution.solution(weights, floors, countFloors, capacityElevator, weightLimit));
    }
    public int solution(int[] A, int[] B, int M, int X, int Y) {
        if (M == 0 || X == 0 || Y == 0 || A == null || B == null || A.length == 0 || B.length == 0) {
            return 0;
        }
        int totalWeight = 0;
        int totalHumans = 0;
        int start = 0;
        int end = 0;
        int counter = 0;
        int totalResult = 0;
        while(totalWeight < Y && totalHumans <= X){
           totalWeight += A[counter];
           totalHumans ++;
           if(totalWeight >=Y || totalHumans == X || counter == A.length-1){
               end = counter;
               start = end - totalHumans +1;
               Elevator elevator = new Elevator(B,start,end);// до какой позиции дошли
               totalHumans = 0;
               totalWeight = 0;
               totalResult += elevator.getResult();
               //создаем лифт и едем
               if(counter == A.length-1){
                   break;
               }
           }

            counter++;

        }
       return totalResult;

    }
    public class Elevator{
        private int start;
        private int end;

        private int [] floors;

        public Elevator(int[] floors, int start,int end) {
            this.floors = floors;
            this.start = start;
            this.end = end;
        }
        public int getResult(){
            int result = 0;
            int currentFloor = 0;
            for(int i=start; i<end+1; i++){
                if(currentFloor != floors[i]){
                    result++;
                }
                currentFloor = floors[i];
            }
            result++; //Когда идем за людьми еще то это тоже остановка на первом этаже
            return result;
        }
    }
}

