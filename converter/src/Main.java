import java.util.Scanner;
import static java.lang.Double.parseDouble;

public class Main {
  public static void main(String[] args) {
    double usdValue = 1.03;

    Scanner sc = new Scanner(System.in);

    System.out.print("Is your current value USD or EUR: ");
    String choice = sc.nextLine();

    if (choice.equalsIgnoreCase("EUR")) {
      System.out.print("\nPlease enter you current value in EUR: ");
      double cur = sc.nextDouble();

      String newValue = String.format("%.2f", cur * usdValue);

      System.out.println("The value of " + cur + "EUR is " + newValue + "USD");
    } else if (choice.equalsIgnoreCase("USD")) {
      System.out.print("\nPlease enter you current value in USD: ");
      double cur = sc.nextDouble();

      String newValue = String.format("%.2f", cur / usdValue);

      System.out.println("The value of " + cur + "USD is " + newValue + "EUR");
    } else {
      System.out.println("That's not a valid choice.\nExiting...");
    }
  }
}