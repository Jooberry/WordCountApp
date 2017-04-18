package example.codeclan.com.wordcountapp;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 18/04/2017.
 */

public class WordCountTest {

    @Test
    public void getWordCountTest() {
        WordCount wordCount = new WordCount("This sucks");
        assertEquals(2, wordCount.getWordCount());
    }

}
