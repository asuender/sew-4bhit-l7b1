package asuender.l7b1.decorator.extended;

import asuender.l7b1.ausdruck.Ausdruck;
import asuender.l7b1.decorator.EinfacheBerechnung;

public class Cosinus extends EinfacheBerechnung {
    public Cosinus(Ausdruck a) {
        super(a);
    }

    @Override
    public double berechne() {
        return Math.cos(super.berechne());
    }

    @Override
    public String textDarstellung() {
        return String.format("cos(%s)", a.textDarstellung());
    }
}
