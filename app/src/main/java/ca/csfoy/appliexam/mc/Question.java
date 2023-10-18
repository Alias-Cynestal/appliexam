package ca.csfoy.appliexam.mc;

public class Question {

    private final String[] questions = {""};
    private final String[][] answersList = {{}, {}, {}, {}};
    private final String[] goodAnswers = {};

    private String question;
    private String[] answers;
    private String goodAnswer;

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

    public String getGoodAnswer() {
        return this.goodAnswer;
    }
}
