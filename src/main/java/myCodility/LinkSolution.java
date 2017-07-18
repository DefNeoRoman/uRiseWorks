package myCodility;

import java.util.ArrayList;
import java.util.List;

public class LinkSolution {
    public static void main(String[] args) {
        int [] A = {1,4,-1,3,2};
        LinkSolution ls = new LinkSolution();
        System.out.println(ls.solution(A));
    }
    public int solution (int[] A){
        List<Integer> resultList = new ArrayList<>();


        for (int i=0; i<A.length; i++){

            Integer value = A[i];
            resultList.add(value);
            Integer linkNext = A[value];
            resultList.add(linkNext);
            if(linkNext == -1){
                break;
            }else{
                i=linkNext-1;
            }


        }
        return resultList.size();
    }
}
