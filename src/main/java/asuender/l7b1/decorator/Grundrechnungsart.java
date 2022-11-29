package asuender.l7b1.decorator;

import asuender.l7b1.ausdruck.Ausdruck;

public abstract class Grundrechnungsart extends EinfacheBerechnung {
    protected Ausdruck b;

    public Grundrechnungsart(Ausdruck a, Ausdruck b) {
        super(a);
        this.b = b;
    }
}
