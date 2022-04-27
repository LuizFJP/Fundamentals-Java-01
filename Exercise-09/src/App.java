import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        int factor = keyboard.nextInt();
        int acc = 1;

        for (int i = factor; i > 0; i--) {
          acc *= i;
        }

        System.out.println(acc);

        keyboard.close();
    }
}
