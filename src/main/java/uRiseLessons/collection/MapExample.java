package uRiseLessons.collection;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;


public class MapExample {


    public static void main(String[] args) throws IOException {
        String text1 = new String(Files.readAllBytes(Paths.get("res\\text.txt")));
        TextAnalizer ta = new TextAnalizer(text1);
        ta.getWords();

        ta.getWordCounts()
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);

    }

}
