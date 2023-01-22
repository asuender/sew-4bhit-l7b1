package asuender.l7b1.decorator.extended;

import asuender.l7b1.ausdruck.Ausdruck;
import asuender.l7b1.decorator.AusdruckDecorator;

public class Betrag extends AusdruckDecorator {
    public Betrag(Ausdruck a) {
        super(a);
    }

    @Override
    public double berechne() {
        return Math.abs(super.berechne());
    }

    @Override
    public String textDarstellung() {
        return String.format("|%s|", a.textDarstellung());
    }
}
