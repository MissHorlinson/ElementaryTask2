package controller;

import model.Envelope;
import service.EnvelopeService;
import util.*;

public class CompareEnvelopes {
    private Input           input = new Input();
    private Output          output = new Output();
    private Parser          parser = new Parser();
    private UserAnswer      answer = new UserAnswer();
    private EnvelopeService service = new EnvelopeService();

    Envelope envelopeOne = new Envelope(envelope("first"), envelope("first"));
    Envelope envelopeTwo = new Envelope(envelope("second"), envelope("second"));

    public float envelope(String number) {
        float side = 0;
        output.envelopeInstruction(number);
        while (side <= 0) {
            output.negativeNumber();
            side = parser.toFloat(input.getString());
        }
        return side;
    }

    public void envelopesCompare() {
        if(service.compare(envelopeOne, envelopeTwo)){
            output.envelopeInput();
        } else {
            output.envelopeNotInput();
        }
    }

    public boolean shouldContinue() {
        output.continueRequest("Task 2");
        return answer.continueRequest(input.getString());
    }
}
