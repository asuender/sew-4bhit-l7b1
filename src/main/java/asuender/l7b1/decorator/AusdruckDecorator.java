package asuender.l7b1.decorator;

import asuender.l7b1.ausdruck.Ausdruck;

public abstract class AusdruckDecorator implements Ausdruck {
    protected Ausdruck a;

    public AusdruckDecorator(Ausdruck ausdruck) {
        this.a = ausdruck;
    }

    public double berechne() {
        return this.a.berechne();
    }

    public String textDarstellung() {
        return this.a.textDarstellung();
    }
}
