package asuender.l7b1;

import asuender.l7b1.ausdruck.Ausdruck;
import asuender.l7b1.ausdruck.Zahl;
import asuender.l7b1.decorator.basic.*;
import asuender.l7b1.decorator.converter.AusdruckConverter;
import asuender.l7b1.decorator.converter.InfixConverter;
import asuender.l7b1.decorator.converter.PostfixConverter;
import asuender.l7b1.decorator.extended.*;

public class MethodenTest {
    public static void testMethod(Ausdruck ausdruck) {
        double actual = ausdruck.berechne();

        System.out.printf("%s = %f%n", ausdruck.textDarstellung(), actual);
    }

    public static void main(String[] args) {
        System.out.println("\n==== Grundlegend ====\n");

        Ausdruck a1 = new Addition(
                new Sinus(new Zahl(3)),
                new Potenz(new Zahl(12),
                        new Multiplikation(new Zahl(2.5), new Cosinus(new Zahl(34.7))))
        );

        Ausdruck a2 = new Addition(
                new Logarithmus(new Zahl(3.567)),
                new Multiplikation(new Zahl(78.9),
                        new Division(new Zahl(2.5), new Cosinus(new Zahl(34.7))))
        );

        Ausdruck a3 = new Multiplikation(
                new Vorzeichenwechsel(new Zahl(5)),
                new Vorzeichenwechsel(new Zahl(-1))
        );

        Ausdruck a4 = new Addition(
                new Potenz(new Sinus(new Zahl(3)), new Zahl(2)),
                new Potenz(new Cosinus(new Zahl(3)), new Zahl(2))
        );


        Ausdruck a5 = new Division(
                new Zahl(1),
                new Division(new Logarithmus(new Zahl(5)), new Zahl(30))
        );

        testMethod(a1);
        testMethod(a2);
        testMethod(a3);
        testMethod(a4);
        testMethod(a5);

        System.out.println("\n==== Postfix & Variablen ====\n");

        Ausdruck pfa1 = AusdruckConverter.convertToAusdruck(new PostfixConverter(), "2 3 4 * +");
        Ausdruck pfa2 = AusdruckConverter.convertToAusdruck(new PostfixConverter(), "2 3 + 4 *");
        Ausdruck pfa3 = AusdruckConverter.convertToAusdruck(new PostfixConverter(), "x sin");

        testMethod(pfa1);
        testMethod(pfa2);
        testMethod(pfa3);

        /*System.out.println("\n==== Infix ====\n");
        Ausdruck ifa1 = AusdruckConverter.convertToAusdruck(new InfixConverter(), "2 + 3 * 4");

        testMethod(ifa1);*/
    }
}
