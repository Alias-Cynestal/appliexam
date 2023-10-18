package ca.csfoy.appliexam.mc;

public class QuestionDTO {
    public final String[] questions = {"À quoi sert la méthode onCreate() dans le cadre du cycle de vie d'une activité?", "Quelle est le principal avantage du patron de conception Vue-Modèle-Contrôleur?", "Quel est le type de vue qui permet d'obtenir une zone de texte dans laquelle l'utilisateur peut écrire?", "Vrai ou faux: Lorsque l'on tourne l'appareil et que l'application fait sa rotation, l'application est uniquement mise en pause"};
    public final String[][] answersList = {{"À instancier l'activité","À démarrer l'activité", "À restaurer l'état sauvegardé d'une activité"},
            {"À faire en sorte que l'application  fonctionne mieux", "À rendre plus simple la maintenance d'une application", "À faciliter la mise en place des principes du Clean Code"},
            {"TextView", "EditView", "EditTextView", "EditText"},
            {"Vrai", "Faux"}};
    public final String[] goodAnswers = {"À instancier l'activité", "À rendre plus simple la maintenance d'une application", "EditText", "Faux"};
}
