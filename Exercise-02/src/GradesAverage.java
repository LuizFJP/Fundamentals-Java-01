import java.util.Scanner;

public class GradesAverage {
    public static void main(String[] args) throws Exception {
      Scanner keyboard = new Scanner(System.in);
      keyboard.useDelimiter("\n");

      float floatgrades = 0.0f;

      String name = keyboard.next();

      for (int i = 0; i < 3; i++) {
        floatgrades += keyboard.nextFloat();
      }

      float average = floatgrades/3;
       
      System.out.println(name+"\n"+String.format("%.1f", average));
      keyboard.close();
    }
}
