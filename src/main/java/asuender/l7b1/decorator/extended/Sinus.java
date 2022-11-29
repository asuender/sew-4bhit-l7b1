package asuender.l7b1.decorator.extended;

import asuender.l7b1.ausdruck.Ausdruck;
import asuender.l7b1.decorator.FunktionInterface;

public class Sinus implements FunktionInterface {
    private Ausdruck a;

    public Sinus(Ausdruck a) {
        this.a = a;
    }

    @Override
    public double berechne() {
        return Math.sin(a.berechne());
    }

    @Override
    public String textDarstellung() {
        return String.format("sin(%s)", a.textDarstellung());
    }
}
