import java.util.Scanner;

public class Change {
    public static void main(String[] args) throws Exception {
      Scanner keyboard = new Scanner(System.in);
      keyboard.useDelimiter("\n");

      String store = keyboard.next();
      int price = keyboard.nextInt();
      int payment = keyboard.nextInt();
      int change = payment - price;

      int countFifty = change / 50;
      if (change >= 50) change -= 50;
      int countTwenty = change / 20;
      if (change >= 20) change -= 20;
      int countTen = change / 10;
      if (change >= 10) change -= 10;
      int countFive = change / 5;
      if (change >= 5) change -= 5;
      int countTwo = change / 2;
      if (change >= 2) change -= 2;
      int countOne = change / 1;
      if (change >= 1) change -= 1;

      System.out.println(store);
      System.out.println(countFifty+"x50");
      System.out.println(countTwenty+"x20");
      System.out.println(countTen+"x10");
      System.out.println(countFive+"x5");
      System.out.println(countTwo+"x2");
      System.out.println(countOne+"x1");

      keyboard.close();
    }
}
