package example.codeclan.com.wordcountapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordActivity extends AppCompatActivity {

    private EditText inputText;
    private TextView textView;
    private Button counterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);

        Log.d(getClass().toString(), "onCreate is called");

        inputText = (EditText) findViewById(R.id.input_text);
        counterButton = (Button) findViewById(R.id.counter_button);
        textView = (TextView) findViewById(R.id.text_box);
    }

    public void onCounterButtonClicked(View button) {
        Log.d(getClass().toString(), "onCounterButton was clicked");

        String textInput = inputText.getText().toString();

        WordCount wordCount = new WordCount(textInput);
        int count = wordCount.getWordCount();

        textView.setText("The word count is " + count);

    }
}
