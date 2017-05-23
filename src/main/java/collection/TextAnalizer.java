package collection;

import java.util.*;

public class TextAnalizer {
    private String text;
    private Map<String, Integer> wordCounts;
    ArrayList<String> words;

    public TextAnalizer(String text) {

        this.text = text;
    }
    public ArrayList<String> getWords(){
        String fragments[] = splitTextIntoFragments();
        ArrayList<String> words = new ArrayList<>();
        for (String fragment : fragments) {
            if (fragment.matches(".*[a-zA-Z].*")) {
                words.add(fragment);
            }
        }
        return words;
    }
    private String[] splitTextIntoFragments() {

        return text.toLowerCase().split("[^a-z0-9\\-']");
    }
    public void countWords(){

        words = getWords();
        wordCounts = new TreeMap<>();

        for(String s: words){

          Integer count = wordCounts.get(s);
            wordCounts.put(s,count == null ? 1 : count+1);
        }

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return wordCounts.get(o2) - wordCounts.get(o1);
            }
        });



    }

    public Map<String, Integer> getWordCounts() {
        return wordCounts;
    }
}
