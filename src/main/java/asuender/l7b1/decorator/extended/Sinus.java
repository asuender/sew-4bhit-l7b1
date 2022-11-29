package asuender.l7b1.decorator.extended;

import asuender.l7b1.ausdruck.Ausdruck;
import asuender.l7b1.decorator.EinfacheBerechnung;

public class Sinus extends EinfacheBerechnung {
    public Sinus(Ausdruck a) {
        super(a);
    }

    @Override
    public double berechne() {
        return Math.sin(super.berechne());
    }

    @Override
    public String textDarstellung() {
        return String.format("sin(%s)", a.textDarstellung());
    }
}
