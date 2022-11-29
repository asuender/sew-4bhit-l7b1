package asuender.l7b1.decorator.extended;

import asuender.l7b1.ausdruck.Ausdruck;
import asuender.l7b1.decorator.FunktionInterface;

public class Logarithmus implements FunktionInterface {
    private Ausdruck a;

    public Logarithmus(Ausdruck a) {
        this.a = a;
    }

    @Override
    public double berechne() {
        return Math.log(a.berechne());
    }

    @Override
    public String textDarstellung() {
        return String.format("log(%s)", a.textDarstellung());
    }
}