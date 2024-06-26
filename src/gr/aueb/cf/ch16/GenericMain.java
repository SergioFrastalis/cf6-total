package gr.aueb.cf.ch16;

public class GenericMain {

    public static void main(String[] args) {
        ISpeakable whiteCat = new ISpeakable.Cat("whiteCat");
        ISpeakable blackDog = new Dog("blackDog", 5D);

        //Wiring
        GenericSpeakingSchool genericSpeakingSchool = new GenericSpeakingSchool(whiteCat);
        GenericSpeakingSchool genericSpeakingSchool1 = new GenericSpeakingSchool(blackDog);
    }
}
