package collection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Пользователь on 25.05.2017.
 */
public class App {
    public static void main(String[] args) {
        String pattern = "^[A-Z|А-Я][a-z|а-я]{1,19}";
        String text = "Das";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        System.out.println(m.matches());
    }

}
