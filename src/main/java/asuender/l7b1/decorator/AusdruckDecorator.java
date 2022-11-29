package asuender.l7b1.decorator;

import asuender.l7b1.ausdruck.Ausdruck;

public abstract class AusdruckDecorator implements Ausdruck {
    private Ausdruck ausdruck;

    public AusdruckDecorator(Ausdruck ausdruck) {
        this.ausdruck = ausdruck;
    }

    public double berechne() {
        return this.ausdruck.berechne();
    }

    public String textDarstellung() {
        return this.ausdruck.textDarstellung();
    }
}
