import controller.CompareEnvelopes;

public class Main {
    public static void main(String[] args) {
        while (true) {
            CompareEnvelopes compareEnvelopes = new CompareEnvelopes();
            compareEnvelopes.envelopesCompare();
            if(!compareEnvelopes.shouldContinue())
               break;
        }
    }
}
