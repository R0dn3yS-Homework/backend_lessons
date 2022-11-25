import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    convert();
  }

  public static void convert() {
    Scanner sc = new Scanner(System.in);
    Result rate = getRate(sc);
    Result conversionRate = convertTo(rate.getFirst(), sc);

    System.out.print("\nPlease enter you current value in " + rate.getSecond() + ": ");
    double cur = sc.nextDouble();

    String newValue = String.format("%.2f", cur * conversionRate.getFirst());

    System.out.println("The value of " + cur + rate.getSecond() + " is " + newValue + conversionRate.getSecond());

    System.out.print("\nDo you want to convert another value (y/N) ");
    sc.nextLine();
    String again = sc.nextLine();
    if (again.equalsIgnoreCase("y") || again.equalsIgnoreCase("yes")) {
      sc.close();
      convert();
    } else {
      sc.close();
      System.exit(0);
    }
  }

  public static Result getRate(Scanner sc) {
    double rate = 0;

    System.out.print("\nWhat is your current currency: EUR, USD, JPY or AUD: ");
    String choice = sc.nextLine();

    switch (choice.toUpperCase()) {
      case "EUR" -> {
        rate = 1.0;
      }
      case "JPY" -> {
        rate = 145.79;
      }
      case "USD" -> {
        rate = 1.03;
      }
      case "AUD" -> {
        rate = 1.55;
      }
      default -> {
        System.out.println("Invalid choice.\nExiting...");
        System.exit(1);
      }
    }

    return new Result(rate, choice.toUpperCase());
  }

  public static Result convertTo(double rate, Scanner sc) {
    double newRate = 0;

    System.out.print("\nDo you want to convert to EUR, USD, JPY or AUD: ");
    String choice = sc.nextLine();

    switch (choice.toUpperCase()) {
      case "EUR" -> {
        newRate = 1.0 / rate;
      }
      case "JPY" -> {
        newRate = 145.79 / rate;
      }
      case "USD" -> {
        newRate = 1.03 / rate;
      }
      case "AUD" -> {
        newRate = 1.55 / rate;
      }
      default -> {
        System.out.println("Invalid choice.\nExiting...");
        System.exit(1);
      }
    }

    return new Result(newRate, choice.toUpperCase());
  }
}
