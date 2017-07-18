package myCodility;

import java.util.ArrayList;
import java.util.List;

public class Brackets {
    public static void main(String[] args) {
        Brackets brackets = new Brackets();
        System.out.println(brackets.solution("(())))("));

    }
    public int solution(String S) {
        char [] brackets = S.toCharArray();
        List<Character> leftPart = new ArrayList<>();
        List<Character> rightPart = new ArrayList<>();

        for(char c : brackets){
            if(c == '('){
                leftPart.add(c);
            }else {
                rightPart.add(c);
            }
        }
        int difference = Math.abs(leftPart.size() - rightPart.size());
        int result = 0;
        if(leftPart.size()>rightPart.size()){
            result = difference+rightPart.size();
        }else{
            result = difference+leftPart.size();
        }
        return result;
    }
}
