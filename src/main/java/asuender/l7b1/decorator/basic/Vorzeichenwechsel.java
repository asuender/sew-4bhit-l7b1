package asuender.l7b1.decorator.basic;

import asuender.l7b1.ausdruck.Ausdruck;
import asuender.l7b1.decorator.AusdruckDecorator;

public class Vorzeichenwechsel extends AusdruckDecorator {
    public Vorzeichenwechsel(Ausdruck a) {
        super(a);
    }

    @Override
    public double berechne() {
        return -this.a.berechne();
    }

    @Override
    public String textDarstellung() {
        return String.format("-%s", a.textDarstellung());
    }
}
