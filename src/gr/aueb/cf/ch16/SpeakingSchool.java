package gr.aueb.cf.ch16;

public class SpeakingSchool {
    private final ISpeakable.Cat cat = new ISpeakable.Cat();

    public SpeakingSchool() {

    }

    public void LearnToSpeak() {
        cat.speak();
    }


}
