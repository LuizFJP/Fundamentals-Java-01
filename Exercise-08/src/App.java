import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);

    double a = keyboard.nextDouble();
    int b = keyboard.nextInt();
    int c = keyboard.nextInt();

    double delta = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

    if (delta == 0) {
      System.out.print(String.format("%.2f", (b * -1) / (2 * a)));
    } else if (delta > 0) {
      System.out.print(String.format(
        "%.2f", ((b * -1) + delta) / (2 * a)) + ";");
      System.out.print(String.format(
        "%.2f", ((b * -1) - delta) / (2 * a)));
    } else {
      System.out.println("Sem raiz real");
    }
    
    keyboard.close();
  }
}
