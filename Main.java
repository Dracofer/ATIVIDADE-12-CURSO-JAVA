import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double x;

    x = sc.nextDouble();

    if (x <= 25.00 && x >= 0) {
      System.out.println("Intervalor [0,25]");
    } else if (x >= 25.01 && x <= 50.74) {
      System.out.println("Intervalor [25,50]");
    } else if (x >= 50.75 && x <= 74.99) {
      System.out.println("Intervalor [50,75]");
    } else if (x >= 75) {
      System.out.println("Intervalor [75,100]");
    } else {
      System.out.println("Fora de intervalo");
    }
    sc.close();
  }
}