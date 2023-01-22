package asuender.l7b1.decorator.converter;

import asuender.l7b1.ausdruck.Ausdruck;

import java.util.List;

public interface ConverterInterface {
    public Ausdruck convert(String text);

    public Ausdruck convert(List<String> text);
}
