package edu.desu.mathquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This method will calculate the answer.
    public void submitAnswer (View view) {

        EditText answerLineEditText = (EditText) findViewById(R.id.Answer_Line);

        int answer = Integer.parseInt(answerLineEditText.getText().toString());

        if (answer == 9) {
            //add toast
            Toast.makeText(MainActivity.this, "ANSWER CORRECT!!!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "ANSWER WRONG, TRY AGAIN!!!", Toast.LENGTH_SHORT).show();
        }
    }


}
