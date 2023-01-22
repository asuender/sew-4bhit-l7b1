package asuender.l7b1.decorator.converter;

import asuender.l7b1.ausdruck.Ausdruck;
import org.scijava.parsington.ExpressionParser;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class InfixConverter extends AbstractConverter {
    @Override
    public Ausdruck convert(String text) {
        List<Object> list = new ExpressionParser().parsePostfix(text);
        return new InfixConverter().convert(list.stream().map(object -> Objects.toString(object, null)).collect(Collectors.toList()));
    }
}
