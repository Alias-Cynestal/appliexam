package ca.csfoy.appliexam.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.List;

import ca.csfoy.appliexam.R;
import ca.csfoy.appliexam.mc.AppliExamMC;

public class MainActivity extends AppCompatActivity implements AppliExamView{

    private String txtQuestion;
    private RadioGroup rg;
    private Button btnSubmit;
    private Button btnNext;

    private AppliExamMC mc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtQuestion = findViewById(R.id.txtQuestion);
        this.rg = findViewById(R.id.radioGroup1);
        this.btnSubmit = findViewById(R.id.btnSubmit);
        this.btnNext = findViewById(R.id.btnNext);

        this.mc = new AppliExamMC(this);

        RadioButton button;
        for(int i = 0; i < 3; i++) {
            button = new RadioButton(this);
            button.setText("Button " + i);
            this.rg.addView(button);
        }

        this.update();
        btnSubmit.setOnClickListener((view) -> {
            this.onSubmitAnswer();
        });
        btnNext.setOnClickListener((view) -> {
            this.getToNextQuestion();
        });
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void update() {

    }

    private void onSubmitAnswer() {

    }

    private void getToNextQuestion() {

    }
}