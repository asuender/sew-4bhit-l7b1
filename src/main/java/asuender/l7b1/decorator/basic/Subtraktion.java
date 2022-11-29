package asuender.l7b1.decorator.basic;

import asuender.l7b1.ausdruck.Ausdruck;
import asuender.l7b1.decorator.Grundrechnungsart;

public class Subtraktion extends Grundrechnungsart {
    public Subtraktion(Ausdruck a, Ausdruck b) {
        super(a, b);
    }

    @Override
    public double berechne() {
        return super.a.berechne() - this.b.berechne();
    }

    @Override
    public String textDarstellung() {
        return String.format("(%s - %s)", a.textDarstellung(), b.textDarstellung());
    }
}
