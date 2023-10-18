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
        this.questionDTO = new QuestionDTO();
    }

    public void initQuestion() {
        this.questionDTO = new QuestionDTO();
        int index = (int) (Math.random() * questionDTO.questions.length);
        this.question = questionDTO.questions[index];
        this.answers = questionDTO.answersList[index];
        this.goodAnswer = questionDTO.goodAnswers[index];
    }

    public String getQuestion() {
        return new String (this.question);
    }

    public String[] getAnswers() {
        return copyStringArray(this.answers);
    }

    public String getGoodAnswer() {
        return new String(this.goodAnswer);
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswers(String[] answers) {
        this.answers = copyStringArray(answers);
    }

    public void setGoodAnswer(String goodAnswer) {
        this.goodAnswer = goodAnswer;
    }

    public void getNextQuestion() {
        initQuestion();
        appliExamView.update();
    }

    public boolean validateAnswer(String answer) {
        return this.goodAnswer.equals(answer);
    }

    public String[] copyStringArray(String[] array) {
        String[] copyArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = new String(array[i]);
        }
        return copyArray;
    }
}
