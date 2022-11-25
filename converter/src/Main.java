import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    convert();
  }

  public static void convert() {
    double usdValue = 1.03;
    double jpyValue = 145.79;
    double audValue = 1.55;
    
    String newValue = null;

    Scanner sc = new Scanner(System.in);

    System.out.print("\nDo you want to convert to USD, JPY or AUD: ");
    String choice = sc.nextLine();

    System.out.print("\nPlease enter you current value in EUR: ");
    double cur = sc.nextDouble();

    switch (choice.toUpperCase()) {
      case "JPY" -> {
        newValue = String.format("%.2f", cur * jpyValue);
      }
      case "USD" -> {
        newValue = String.format("%.2f", cur * usdValue);
      }
      case "AUD" -> {
        newValue = String.format("%.2f", cur * audValue);
      }
      default -> {
        System.out.println("Invalid choice.\nExiting...");
        System.exit(1);
      }
    }

    System.out.println("The value of " + cur + "EUR is " + newValue + choice.toUpperCase());

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
}