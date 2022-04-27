import java.util.Scanner;

public class App {
  
  static long fatorial(int valor) {
    if (valor == 0) return 1;
    return valor * fatorial( valor - 1);
  }
  public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);
    int number = keyboard.nextInt();
    System.out.println(fatorial(number));

    keyboard.close();
  }
}
