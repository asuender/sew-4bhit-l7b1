package asuender.l7b1.decorator.variables;

/**
 * @author Andreas Suender
 * @version 01-23-2023
 */
public class ScannerInserter implements InserterInterface {
    private final java.util.Scanner scanner;

    public ScannerInserter() {
        scanner = new java.util.Scanner(System.in);
    }

    @Override
    public double insert() {
        System.out.print("Bitte einen Wert eingeben: ");
        return scanner.nextDouble();
    }
}
