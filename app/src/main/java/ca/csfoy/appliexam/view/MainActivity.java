package ca.csfoy.appliexam.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

import ca.csfoy.appliexam.R;
import ca.csfoy.appliexam.mc.AppliExamMC;

public class MainActivity extends AppCompatActivity implements AppliExamView{

    private static final String GOOD_ANSWER_MESSAGE = "Bravo! Y a peut-être encore de l'espoir avec toi!";
    private static final String WRONG_ANSWER_MESSAGE = "Oh la la... mais quel skill issue...";
    private RelativeLayout parent;
    private TextView txtQuestion;
    private RadioGroup rg;
    private Button btnSubmit;
    private Button btnNext;
    private ArrayList<Button> answerButtons;

    private AppliExamMC mc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.parent = findViewById(R.id.parent);
        this.txtQuestion = findViewById(R.id.txtQuestion);
        this.rg = findViewById(R.id.answers);
        this.btnSubmit = findViewById(R.id.btnSubmit);
        this.btnNext = findViewById(R.id.btnNext);
        this.answerButtons = new ArrayList<Button>();

        this.mc = new AppliExamMC(this);
        this.getToNextQuestion();

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
        mc.setQuestion(savedInstanceState.getString("question"));
        mc.setAnswers(savedInstanceState.getStringArray("answers"));
        mc.setGoodAnswer(savedInstanceState.getString("goodAnswer"));
        this.update();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString("question", mc.getQuestion());
        outState.putStringArray("answers", mc.getAnswers());
        outState.putString("goodAnswer", mc.getGoodAnswer());
        super.onSaveInstanceState(outState);
    }

    @Override
    public void update() {
        for(Button btn: this.answerButtons){
            rg.removeView(btn);
        }
        this.answerButtons = new ArrayList<Button>();
        RadioButton button;
        String[] answers = this.mc.getAnswers();
<<<<<<< Updated upstream
=======
        for(int i = 0; i < answers.length; i++) {
            button = new RadioButton(this);
            button.setText(answers[i]);
            this.rg.addView(button);
            this.answerButtons.add(button);
        }
>>>>>>> Stashed changes
        this.txtQuestion.setText(this.mc.getQuestion());
    }

    private void onSubmitAnswer() {
        RadioButton selectedAnswer = findViewById(rg.getCheckedRadioButtonId());
        boolean isAnswerValid = mc.validateAnswer(selectedAnswer.getText().toString());

        if (isAnswerValid) {
            this.showSnackBar(GOOD_ANSWER_MESSAGE);
        }
        else {
            this.showSnackBar(WRONG_ANSWER_MESSAGE);
        }
    }

    private void getToNextQuestion() {
        this.mc.getNextQuestion();
    }

    private void showSnackBar(String message) {
        Snackbar.make(parent, message, Snackbar.LENGTH_LONG).show();
    }
}