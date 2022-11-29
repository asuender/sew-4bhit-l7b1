package asuender.l7b1.decorator.extended;

import asuender.l7b1.ausdruck.Ausdruck;
import asuender.l7b1.decorator.FunktionInterface;

public class Cosinus implements FunktionInterface {
    private Ausdruck a;

    public Cosinus(Ausdruck a) {
        this.a = a;
    }

    @Override
    public double berechne() {
        return Math.cos(a.berechne());
    }

    @Override
    public String textDarstellung() {
        return String.format("cos(%s)", a.textDarstellung());
    }
}
