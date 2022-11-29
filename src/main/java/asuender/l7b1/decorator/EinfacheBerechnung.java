package asuender.l7b1.decorator;

import asuender.l7b1.ausdruck.Ausdruck;

public abstract class EinfacheBerechnung extends AusdruckDecorator {
    protected Ausdruck a;

    public EinfacheBerechnung(Ausdruck a) {
        super(a);
        this.a = a;
    }
}
