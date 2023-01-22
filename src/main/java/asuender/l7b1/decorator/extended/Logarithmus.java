package asuender.l7b1.decorator.extended;

import asuender.l7b1.ausdruck.Ausdruck;
import asuender.l7b1.decorator.AusdruckDecorator;

public class Logarithmus extends AusdruckDecorator {
    public Logarithmus(Ausdruck a) {
        super(a);
    }

    @Override
    public double berechne() {
        return Math.log(super.berechne());
    }

    @Override
    public String textDarstellung() {
        return String.format("log(%s)", a.textDarstellung());
    }
}