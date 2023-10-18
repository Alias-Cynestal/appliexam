package ca.csfoy.appliexam.mc;

public class Question {

    private final String[] questions = {""};
    private final String[][] answersList = {{}, {}, {}, {}};
    private final int[] goodAnswers = {};

    private String question;
    private String[] answers;
    private int goodAnswer;

    public Question(){
        int index = (int) (Math.random() * questions.length);
        this.question = questions[index];
        this.answers = answersList[index];
        this.goodAnswer = goodAnswers[index];
    }

    public String getQuestion(){
        return this.question;
    }

    public String[] getAnswers(){
        return this.answers.clone();
    }

    public int getGoodAnswer() {
        return this.goodAnswer;
    }
}
