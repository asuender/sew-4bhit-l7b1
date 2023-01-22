package asuender.l7b1.decorator.extended;

import asuender.l7b1.ausdruck.Ausdruck;
import asuender.l7b1.decorator.AusdruckDecorator;

public class Exp extends AusdruckDecorator {
    public Exp(Ausdruck a) {
        super(a);
    }

    @Override
    public double berechne() {
        return Math.exp(super.berechne());
    }

    @Override
    public String textDarstellung() {
        return String.format("exp(%s)", a.textDarstellung());
    }
}
