package asuender.l7b1.decorator.variables;

import asuender.l7b1.ausdruck.Ausdruck;
import asuender.l7b1.decorator.AusdruckDecorator;

/**
 * @author Andreas Suender
 * @version 01-23-2023
 */
public class Variable extends AusdruckDecorator {
    InserterInterface inserter;
    private final String name;
    private Ausdruck a;

    public Variable(String name, InserterInterface inserter) {
        super(null);
        this.name = name;
        this.inserter = inserter;
    }

    public String getName() {
        return name;
    }

    @Override
    public double berechne() {
        return this.inserter.insert();
    }

    @Override
    public String textDarstellung() {
        return name;
    }
}
