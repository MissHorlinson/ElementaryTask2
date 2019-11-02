package model;

public class Envelope implements Comparable{

    private float sideA;
    private float sideB;

    public Envelope() { }

    public Envelope(float sideA, float sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public float getSideA(){
        return this.sideA;
    }

    public float getSideB(){
        return this.sideB;
    }

    public void setSideA(float sideA) { this.sideA = sideA; }

    public void setSideB(float sideB) { this.sideB = sideB; }


    public float getHeight() {
        if(this.getSideA() < this.getSideB()) {
            return getSideA();
        } else {
            return getSideB();
        }
    }

    public float getWidth() {
        if(this.getSideA() < this.getSideB()) {
            return getSideB();
        } else {
            return getSideA();
        }
    }

    @Override
    public int compareTo(Object o) {
        Envelope envelope = (Envelope)o;
        if(this.getHeight() > envelope.getHeight()) {
            if(this.getWidth() > envelope.getWidth()) {
                return 1;
            }
        }
        return 0;
    }
}
