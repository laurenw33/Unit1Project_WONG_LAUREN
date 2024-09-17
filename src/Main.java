//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tipConversion = 0.01;

        Scanner s = new Scanner (System.in);
        System.out.print("Please enter bill amount: ");
        String x = s.nextLine();
        double billAmount = Double.parseDouble(x);

        System.out.print("Please enter number of people in your party: ");
        String y = s.nextLine();
        int numPeople = Integer.parseInt(y);

        System.out.print("Please enter tip percentage: ");
        String z = s.nextLine();
        int tipPercent = Integer.parseInt(z);

        double tipDecimal = tipPercent * tipConversion;

        double billTotal = billAmount * (1 + (tipDecimal));
        double billTotalPP = (billAmount * (1 + tipDecimal) / numPeople);
        double totalTip = billAmount * tipDecimal;
        double tipPP = totalTip / numPeople;

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Here is your bill!");
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("Total Bill (without tip): $" + billAmount);
        System.out.println("Tip Percentage: " + tipPercent + "%");
        System.out.println("Total Tip: $" + totalTip);
        System.out.println();
        System.out.println("Total Bill: $" + billTotal);
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Costs Per Person:");
        System.out.println("Total Tip: $" + tipPP);
        System.out.println("Total Bill: $" + billTotalPP);
        System.out.println("---------------------------------");



    }
}