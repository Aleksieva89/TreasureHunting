package com.home.croaton.followme.activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.home.croaton.followme.R;

public class QuizzActivity extends AppCompatActivity {
    private int points = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.button1:
                if (checked)

                    Toast.makeText(this, "Right answer", Toast.LENGTH_SHORT).show();
                    points += 5;

                break;
            case R.id.button2:
                if (checked)

                    Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show();

                break;
            case R.id.button3:
                if (checked)

                    Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show();

                break;
            case R.id.button4:
                if (checked)

                    Toast.makeText(this, "Right answer", Toast.LENGTH_SHORT).show();
                    points += 5;

                break;
        }

    }

    public void onDoneButtonClicked(View view){
        Intent score = new Intent();
        score.putExtra("score", "Well done! You've got " + points +" points");
        setResult(Activity.RESULT_OK, score);
        finish();
    }
}