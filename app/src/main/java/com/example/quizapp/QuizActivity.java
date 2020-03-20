package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class QuizActivity extends AppCompatActivity {

    private Button submitButton;
    private int score = 0;
    private RadioGroup q1RadioG,q2RadioG,q3RadioG,q6RadioG,q7RadioG,q8RadioG,q10RadioG;
    private CheckBox q9c1Check, q9c2Check, q9i1Check, q9i2Check;
    private EditText q4aText, q5aText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        submitButton = findViewById(R.id.submit_button);
        q4aText = findViewById(R.id.q4_answer);
        q5aText = findViewById(R.id.q5_answer);
        q9c1Check = findViewById(R.id.q9correct1_checkbox);
        q9c2Check = findViewById(R.id.q9correct2_checkbox);
        q9i1Check = findViewById(R.id.q9incorrect1_checkbox);
        q9i2Check = findViewById(R.id.q9incorrect2_checkbox);
        q1RadioG = findViewById(R.id.q1_radio_group);
        q2RadioG = findViewById(R.id.q2_radio_group);
        q3RadioG = findViewById(R.id.q3_radio_group);
        q6RadioG = findViewById(R.id.q6_radio_group);
        q7RadioG = findViewById(R.id.q7_radio_group);
        q8RadioG = findViewById(R.id.q8_radio_group);
        q10RadioG = findViewById(R.id.q10_radio_group);
        q1RadioG.clearCheck();
        q2RadioG.clearCheck();
        q3RadioG.clearCheck();
        q6RadioG.clearCheck();
        q7RadioG.clearCheck();
        q8RadioG.clearCheck();
        q10RadioG.clearCheck();
        q1RadioG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q1_answer_radio_button){
                    score += 1;
                }
            }
        });
        q2RadioG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q2_answer_radio_button){
                    score += 1;
                }
            }
        });
        q3RadioG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q3_answer_radio_button){
                    score += 1;
                }
            }
        });
        q6RadioG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q6_answer_radio_button){
                    score += 1;
                }
            }
        });
        q7RadioG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q7_answer_radio_button){
                    score += 1;
                }
            }
        });
        q8RadioG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q8_answer_radio_button){
                    score += 1;
                }
            }
        });
        q10RadioG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.q10_answer_radio_button){
                    score += 1;
                }
            }
        });
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String answer4, answer5;
                answer4 = q4aText.getText().toString();
                answer5 = q5aText.getText().toString();
                if (answer4.equalsIgnoreCase("marcel")){
                    score += 1;
                }
                if (answer5.equalsIgnoreCase("college")){
                    score += 1;
                }
                if (q9c1Check.isChecked() && q9c2Check.isChecked() && !q9i1Check.isChecked() && !q9i2Check.isChecked()){
                    score += 1;
                }
                Intent intent = new Intent(QuizActivity.this, ScoreActivity.class);
                intent.putExtra("SCORE",score+"/10");
                startActivity(intent);
            }
        });
    }
}
