import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = 0;

        while(true) {
          if (a % b == 0) break;
          c = a % b;
          a = b;
          b = c;
        }

        System.out.println(c);

        keyboard.close();
    }
}
