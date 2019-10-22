package service;

import model.Envelope;

public class EnvelopeService {

    public boolean compare (Envelope one, Envelope two) {
        if (one.compareTo(two) == 1) {
            return true;
        } else if (two.compareTo(one) == 1) {
            return true;
        } else
            return false;
    }
}
