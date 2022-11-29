package nl.dfagaming;

public class Vat {
  public static double calcVat(double value, double percentage) {
    return value * (percentage / 100);
  }
}
