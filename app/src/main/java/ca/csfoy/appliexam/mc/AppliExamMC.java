package ca.csfoy.appliexam.mc;

import ca.csfoy.appliexam.view.AppliExamView;

public class AppliExamMC {

    private AppliExamView appliExamView;
    private Question question;

    public AppliExamMC(AppliExamView appliExamView){
        this.appliExamView = appliExamView;
    }

    public void initQuestion() {
        this.question = new Question();
    }

    
}
