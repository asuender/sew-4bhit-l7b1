package asuender.l7b1.decorator.converter;

import asuender.l7b1.ausdruck.Ausdruck;

public class AusdruckConverter {
    public static Ausdruck convertToAusdruck(ConverterInterface converter, String text) {
        return converter.convert(text);
    }
}
