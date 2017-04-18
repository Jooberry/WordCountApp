package example.codeclan.com.wordcountapp;

/**
 * Created by user on 18/04/2017.
 */

public class WordCount {

    private String sentence;

    public WordCount(String sentence){
        this.sentence = sentence;
    }

    public int getWordCount () {
        String[] words = sentence.split("\\s+");
        return words.length;
    }
}
