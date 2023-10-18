package ca.csfoy.appliexam.mc;

import ca.csfoy.appliexam.view.AppliExamView;

public class AppliExamMC {

    private AppliExamView appliExamView;

    private String question;
    private String[] answers;
    private String goodAnswer;
    private QuestionDTO questionDTO;

    public AppliExamMC(AppliExamView appliExamView){
        this.appliExamView = appliExamView;
    }

    public void initQuestion() {
        int index = (int) (Math.random() * questionDTO.questions.length);
        this.question = questionDTO.questions[index];
        this.answers = questionDTO.answersList[index];
        this.goodAnswer = questionDTO.goodAnswers[index];
    }

    public String getQuestion() {
        return this.question;
    }

    public String[] getAnswers() {
        return this.answers.clone();
    }

    public String getGoodAnswer() {
        return this.goodAnswer;
    }

    public void getNextQuestion() {
        initQuestion();
        appliExamView.update();
    }

    public boolean validateAnswer(String answer) {
        return this.goodAnswer == answer;
    }
}
