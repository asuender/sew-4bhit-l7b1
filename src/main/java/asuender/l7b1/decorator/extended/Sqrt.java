package asuender.l7b1.decorator.extended;

import asuender.l7b1.ausdruck.Ausdruck;
import asuender.l7b1.decorator.AusdruckDecorator;

public class Sqrt extends AusdruckDecorator {
    public Sqrt(Ausdruck a) {
        super(a);
    }

    @Override
    public double berechne() {
        return Math.sqrt(super.berechne());
    }

    @Override
    public String textDarstellung() {
        return String.format("sqrt(%s)", a.textDarstellung());
    }
}
