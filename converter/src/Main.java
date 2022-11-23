import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    convert();
  }

  public static void convert() {
    double usdValue = 1.03;
    double jpyValue = 145.79;
    double audValue = 1.55;

    Scanner sc = new Scanner(System.in);

    System.out.print("\nDo you want to convert to USD, JPY or AUD: ");
    String choice = sc.nextLine();

    switch (choice.toUpperCase()) {
      case "JPY" -> {
        System.out.print("\nPlease enter you current value in EUR: ");
        double cur = sc.nextDouble();

        String newValue = String.format("%.2f", cur * jpyValue);

        System.out.println("The value of " + cur + "EUR is " + newValue + "JPY");
      }
      case "USD" -> {
        System.out.print("\nPlease enter you current value in EUR: ");
        double cur = sc.nextDouble();

        String newValue = String.format("%.2f", cur * usdValue);

        System.out.println("The value of " + cur + "EUR is " + newValue + "USD");
      }
      case "AUD" -> {
        System.out.print("\nPlease enter you current value in EUR: ");
        double cur = sc.nextDouble();

        String newValue = String.format("%.2f", cur * audValue);

        System.out.println("The value of " + cur + "EUR is " + newValue + "AUD");

      }
    }

    System.out.print("\nDo you want to convert another value (y/N) ");
    sc.nextLine();
    String again = sc.nextLine();
    if (again.equalsIgnoreCase("y")) {
      convert();
    }
  }
}