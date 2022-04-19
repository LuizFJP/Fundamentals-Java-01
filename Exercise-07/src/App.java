import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        String mathOperator = keyboard.next();
        float numberOne = keyboard.nextFloat();

        if (mathOperator.equals("abs")) {
          System.out.println(String.format("%.1f", Math.abs(numberOne)));
        } else {

        float numberTwo = keyboard.nextFloat();

        switch(mathOperator) {
          case "sum":
            System.out.println(String.format("%.1f", numberOne + numberTwo));
            break;
          case "sub":
            System.out.println(String.format("%.1f", numberOne - numberTwo));
            break;
          case "mult":
            System.out.println(String.format("%.1f", numberOne - numberTwo));
            break;
          default:
            if(numberTwo == 0) {
              System.out.println("Divisão por zero");
            } else {
              System.out.println(String.format("%.1f", numberOne / numberTwo));
            }
        }
      }
        keyboard.close();
    }
}
