package controller;

import model.Envelope;
import service.EnvelopeService;
import util.*;

public class CompareEnvelopes {

    private Input           input = new Input();
    private Output          output = new Output();
    private Validator       validator = new Validator();
    private EnvelopeService service = new EnvelopeService();

    Envelope envelopeOne = new Envelope(envelopeSide("first"), envelopeSide("first"));
    Envelope envelopeTwo = new Envelope(envelopeSide("second"), envelopeSide("second"));

    public float envelopeSide(String number) {
        output.envelopeInstruction(number);
        String sideValue = input.getString();
        while (!validator.isValid(sideValue)) {
            output.wrongData();
             sideValue = input.getString();
            }
        float side = validator.getFloat(sideValue);
        return side;
    }

    public void envelopesCompare() {
        if (service.compare(envelopeOne, envelopeTwo)) {
            output.envelopeInput();
        } else {
            output.envelopeNotInput();
        }
    }

    public boolean shouldContinue() {
        output.continueRequest();
        return validator.continueRequest(input.getString());
    }
}
