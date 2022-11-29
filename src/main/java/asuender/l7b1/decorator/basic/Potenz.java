package asuender.l7b1.decorator.basic;

import asuender.l7b1.ausdruck.Ausdruck;
import asuender.l7b1.decorator.Grundrechnungsart;

public class Potenz extends Grundrechnungsart {

    public Potenz(Ausdruck a, Ausdruck b) {
        super(a, b);
    }

    @Override
    public double berechne() {
        return Math.pow(this.a.berechne(), this.b.berechne());
    }

    @Override
    public String textDarstellung() {
        return String.format("(%s ^ %s)", a.textDarstellung(), b.textDarstellung());
    }
}
