package asuender.l7b1.decorator.basic;

import asuender.l7b1.ausdruck.Ausdruck;
import asuender.l7b1.decorator.Grundrechnungsart;

/**
 * @author Andreas Suender
 * @version 11-30-2022
 */
public class Division extends Grundrechnungsart {
    public Division(Ausdruck a, Ausdruck b) {
        super(a, b);
    }

    @Override
    public double berechne() {
        return a.berechne() / b.berechne();
    }

    @Override
    public String textDarstellung() {
        return String.format("(%s / %s)", a.textDarstellung(), b.textDarstellung());
    }
}
