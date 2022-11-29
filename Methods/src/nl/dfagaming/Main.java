package nl.dfagaming;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Bedrag om BTW van te berekenen: ");
    double input = sc.nextDouble();
    sc.close();

    System.out.println("BTW is: " + String.format("%.2f", Vat.calcVat(input, 21)));
  }
}
