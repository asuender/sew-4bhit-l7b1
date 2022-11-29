package asuender.l7b1.decorator;

import asuender.l7b1.ausdruck.Ausdruck;

public class Funktion implements Ausdruck {
    private FunktionInterface f;

    public Funktion(FunktionInterface f) {
        this.f = f;
    }

    @Override
    public double berechne() {
        return f.berechne();
    }

    @Override
    public String textDarstellung() {
        return f.textDarstellung();
    }
}
