import java.util.Scanner;

public class Salary {
    public static void main(String[] args) throws Exception {

      Scanner keyboard = new Scanner(System.in);
      keyboard.useDelimiter("\n");
      
      String name = keyboard.next();
      int hours = keyboard.nextInt();
      float moneyPerHour = keyboard.nextFloat();
      int children = keyboard.nextInt();
      double percentage = children * 0.03;

      float salary = hours * moneyPerHour;

      System.out.printf("%s: %s", name, String.format("%.2f", salary + (salary * percentage)));
      keyboard.close();
    }
}
