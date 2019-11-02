package util;

public class Output {

    public void wrongData() {
        System.out.println("Not valid data");
    }

    public void envelopeInstruction(String number) {
        System.out.println("Enter " + number + " envelope parameters");
    }

    public void envelopeInput() {
        System.out.println("Yes you can input one envelope into another");
    }

    public void envelopeNotInput() {
        System.out.println("No you can`t input one envelope into another");
    }

    public void continueRequest() {
        System.out.println("Enter y - Yes, if you want to continue comparing envelope");
    }
}
