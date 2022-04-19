import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner keyboard = new Scanner(System.in);

      String name = keyboard.next();
      double salary = keyboard.nextDouble();
      double financing = keyboard.nextDouble();

      System.out.println(name);
      if (financing <= salary * 5) {
        System.out.println("Financiamento CONCEDIDO");
      } else {
        System.out.println("Financiamento NEGADO");
      }

      System.out.println("Obrigado por nos consultar");
      keyboard.close();
    }
}
