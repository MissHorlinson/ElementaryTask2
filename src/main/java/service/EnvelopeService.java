package service;

import model.Envelope;

public class EnvelopeService {

    public boolean compare(Envelope one, Envelope two) {
        if ((one.getHeight() > getDiagonal(two)) || (one.compareTo(two) == 1)) {
            return true;
        } else if ((two.getHeight() > getDiagonal(one)) || (two.compareTo(one) == 1)) {
            return true;
        } else
            return false;
    }

    public double getDiagonal(Envelope envelope) {
        return Math.sqrt(Math.pow(envelope.getHeight(), 2) + Math.pow(envelope.getWidth(), 2));
    }
}
