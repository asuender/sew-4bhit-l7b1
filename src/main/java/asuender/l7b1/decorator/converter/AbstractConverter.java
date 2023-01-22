package asuender.l7b1.decorator.converter;

import asuender.l7b1.ausdruck.Ausdruck;

import java.util.List;

public abstract class AbstractConverter implements ConverterInterface {
    @Override
    public Ausdruck convert(List<String> text) {
        return convert(String.join(" ", text));
    }
}
