package sandbox.wordMachineEmulator;

import java.util.ArrayList;
import java.util.List;

//Написать функцию:
//        решение класса { решение публичных инт(строка s); }
//        что, дана строка s, содержащая последовательность операций для слова машина,
// возвращает результат машина вернется после обработки операции. Функция должна возвращать -1,
// если машина будет сообщать об ошибке при обработке операций.
//        Например, дана строка s = "13 ДУП 4 поп 5 ДУП + ДУП + -" функция должна возвращать 7,
// как описано в примере выше. Дана строка s = "5 6 + -" или s = "3 ДУП 5 - -" функция должна возвращать -1.
//       Предположим, что:
//      длина s находится в диапазоне [0..2,000];
// s представляет собой допустимую последовательность слов машинных операций. В решении,
// сосредоточиться на правильности. Производительность вашего решения не являются объектом оценки.
//Например, дана строка "13 DUP 4 POP 5 DUP + DUP + -", машина выполняет следующие операции:
//DUP - это дублировать 13
//POP - это убрать верхний
// + - это сложить
// "-" - это достать два верхних элемента и вычесть второй элемент из первого, а разницу положить в стек
//        действия | комментарии | стек
//       | | [пустой]
//        "13" | нажимаем 13 | | | 13 "ДУП" | дублировать 13 | | | 13, 13 "4" |
//        пуш 4 | | | 13, 13, 4 "поп" |
//        поп 4 | | | 13, 13 "5" |
//        пуш 5 | | | 13, 13, 5 "ДУП" |
//        дублировать 5 | | | 13, 13, 5, 5 "+" |
//        добавить 5 и 5 | | | 13, 13, 10 "ДУП" |
//        дублировать 10 | | | 13, 13, 10, 10 "+" |
//        добавить 10 и 10 | | | 13, 13, 20 "-" |
//        вычтите 13 из 20 | | | 13, 7
//        наконец, машина вернет 7.
public class Solution {
    public static void main(String[] args) {
        String s = "13 DUP 4 POP 5 DUP + DUP + -";
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
    }
    public int solution(String s){
        String [] arrayOfString = s.split(" ");
        List<Integer> stack = new ArrayList<>();
        int counter = 0;
        for(String action:arrayOfString){
            counter = stack.size()-1;
            switch (action){
                case "DUP":
                    int number = stack.get(counter);
                    stack.add(number);
                    break;
                case "POP":

                    stack.remove(counter);
                    break;
                case "+" :
                    int numberOne = stack.get(counter);
                    int numberTwo = stack.get(counter-1);
                    int result = numberOne+numberTwo;
                    stack.remove(counter--);
                    stack.remove(counter);
                    stack.add(result);
                    break;
                case "-" :
                    int number1 = stack.get(counter);
                    int number2 = stack.get(counter-1);
                    int resultMinus = number1-number2;
                    stack.remove(counter--);
                    stack.remove(counter);
                    stack.add(resultMinus);
                    break;
                default:
                    Integer addingNumber = Integer.parseInt(action);
                    stack.add(addingNumber);

            }

        }

        return stack.get(counter);
    }
}
