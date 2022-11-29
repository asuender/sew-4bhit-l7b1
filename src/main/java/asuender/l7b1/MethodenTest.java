package asuender.l7b1;

import asuender.l7b1.ausdruck.Ausdruck;
import asuender.l7b1.ausdruck.Zahl;
import asuender.l7b1.decorator.Funktion;
import asuender.l7b1.decorator.basic.*;
import asuender.l7b1.decorator.extended.*;

public class MethodenTest {
    public static void main(String[] args) {
        Ausdruck a = new Addition(
                new Sinus(new Zahl(3)),
                new Potenz(
                        new Zahl(12),
                        new Multiplikation(
                                new Zahl(2.5),
                                new Funktion(new Cosinus(new Zahl(34.7)))
                        )
                )
        );

        System.out.println(a.textDarstellung() + " = " + a.berechne());
    }
}
