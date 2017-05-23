package collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class MapExample {


    public static void main(String[] args) throws IOException {
        String text1 = new String(Files.readAllBytes(Paths.get("res\\text.txt")));
        TextAnalizer ta = new TextAnalizer(text1);
        ta.getWords();
        ta.countWords();
        System.out.println(ta.getWordCounts().toString());

    }

}
