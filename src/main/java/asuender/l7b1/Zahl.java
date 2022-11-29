package asuender.l7b1;

import asuender.l7b1.ausdruck.Ausdruck;

public class Zahl implements Ausdruck {
    private double zahl;

    public Zahl(double a) {
        this.zahl = a;
    }

    @Override
    public double berechne() {
        return this.zahl;
    }

    @Override
    public String textDarstellung() {
        return String.format("%.2f", this.zahl);
    }
}
