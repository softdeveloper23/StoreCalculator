package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double croissants, coffee, iceCream, milkChocolate, donuts, tea;
        Scanner scanner = new Scanner(System.in);
        // Ask user for their name
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s! How much monthly income did you earn for the following items?\n", name);

        System.out.println();
        System.out.println("Please enter the amount earned for croissants:");
        croissants = scanner.nextDouble();

        System.out.println("Please enter the amount earned for coffee:");
        coffee = scanner.nextDouble();

        System.out.println("Please enter the amount earned for ice cream:");
        iceCream = scanner.nextDouble();

        System.out.println("Please enter the amount earned for milk chocolate:");
        milkChocolate = scanner.nextDouble();

        System.out.println("Please enter the amount earned for donuts:");
        donuts = scanner.nextDouble();

        System.out.println("Please enter the amount earned for tea:");
        tea = scanner.nextDouble();

        double total = croissants + coffee + iceCream + milkChocolate + donuts + tea;

        System.out.println();
        System.out.printf("Your monthly income is: $%.2f", total);

        System.out.println();
        System.out.println();

        System.out.println("How much were your staff expenses for the month?");
        double staffExpenses = scanner.nextDouble();

        System.out.println("How much were your other expenses for the month?");
        double otherExpenses = scanner.nextDouble();

        double netIncome = total - (staffExpenses + otherExpenses);

        System.out.printf("\nYour net income for the month is: $%.2f", netIncome);
    }
}
