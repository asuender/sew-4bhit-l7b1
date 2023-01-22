package asuender.l7b1.decorator.converter;

import asuender.l7b1.ausdruck.*;
import asuender.l7b1.decorator.basic.*;
import asuender.l7b1.decorator.extended.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class PostfixConverter extends AbstractConverter {
    private static boolean isNumeric(String strNum) {
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }

    @Override
    public Ausdruck convert(String text) {
        List<Ausdruck> list = new ArrayList<>();
        String[] parts = text.split("\\s+");

        for (int i = 0; i < parts.length; i++) {
            if (isNumeric(parts[i])) {
                list.add(new Zahl(Double.parseDouble(parts[i])));
            } else {
                Ausdruck a = list.remove(list.size() - 1);
                Ausdruck b = list.remove(list.size() - 1);

                switch (parts[i]) {
                    case "+":
                        list.add(new Addition(b, a));
                        break;
                    case "-":
                        list.add(new Subtraktion(b, a));
                        break;
                    case "*":
                        list.add(new Multiplikation(b, a));
                        break;
                    case "/":
                        list.add(new Division(b, a));
                        break;
                    case "sin":
                        list.add(new Sinus(a));
                        break;
                    case "cos":
                        list.add(new Cosinus(a));
                        break;
                    case "log":
                    case "ln":
                        list.add(new Logarithmus(a));
                        break;
                    case "exp":
                        list.add(new Exp(a));
                        break;
                    case "sqrt":
                        list.add(new Sqrt(a));
                        break;
                    case "pow":
                        list.add(new Potenz(b, a));
                        break;
                    case "abs":
                        list.add(new Betrag(a));
                        break;
                    case "neg":
                        list.add(new Vorzeichenwechsel(a));
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown operator: " + parts[i]);
                }
            }
        }

        return list.get(0);
    }
}
