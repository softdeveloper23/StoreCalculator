package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask user for their name
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s!", name);

        int total = 202 + 118 + 2250 + 1680 + 1075 + 80;

        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $202");
        System.out.println("Toffee: $118");
        System.out.println("Ice cream: $2250");
        System.out.println("Milk chocolate: $1680");
        System.out.println("Doughnut: $1075");
        System.out.println("Pancake: $80");
        System.out.println();
        System.out.println("Income: $" + total);

        System.out.println("Staff expenses:");
        int staffExpenses = scanner.nextInt();

        System.out.println("Other expenses:");
        int otherExpenses = scanner.nextInt();

        int netIncome = total - (staffExpenses + otherExpenses);

        System.out.printf("Net income: $%d", netIncome);
    }
}
