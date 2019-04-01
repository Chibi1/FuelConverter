package model;

import java.util.Scanner;

public class FuelConverter {
    private final int KPL_TO_MPG = 1;
    private final int MPG_TO_KPL = 2;
    private final double CONVERSION_FACTOR = 1.609*3.785;

    private double kpl;
    private double mpg;

    Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        while (true) {
            System.out.println("\n--PREFFERRED CONVERSION--\n");
            System.out.println("1. kpl to mpg");
            System.out.println("2. mpg to kpl");
            getSelection();
        }
    }

    private void getSelection() {
        int selection;
        do {
            System.out.print("\n\nEnter your choice: ");
            selection = scanner.nextInt();
        } while (selection > 2);
        convert(selection);
    }

    public void convert(int conversion) {
        if (conversion == KPL_TO_MPG) {
            convertKPLtoMPG();
        } else if (conversion == MPG_TO_KPL) {
            convertMGPToKPL();
        }
    }

    private void convertKPLtoMPG() {
        System.out.print("Enter the kilometers per litre value: ");
        kpl = scanner.nextDouble();
        mpg = kpl/CONVERSION_FACTOR;
        System.out.printf("%s %.2f\n\n", "The equivalent in miles per gallon is: ", mpg);
    }

    private void convertMGPToKPL() {
        System.out.print("Enter the miles per gallon value");
        mpg = scanner.nextDouble();
        kpl = mpg*CONVERSION_FACTOR;
        System.out.printf("%s %.2f\n\n", "The equivalent in kilometers per litre is: ", kpl);
    }
}
