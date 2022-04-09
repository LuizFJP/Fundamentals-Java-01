import java.util.Scanner;
import java.lang.Math;

public class Volume {
    public static void main(String[] args) throws Exception {
      Scanner keyboard = new Scanner(System.in);
      keyboard.useDelimiter("\n");

      float radius = keyboard.nextFloat();
      float height = keyboard.nextFloat();
      float pi = 3.14f;

      double volume = pi * (Math.pow(radius, 2) * height);

      System.out.println(String.format("%.2f", volume));

      keyboard.close();
    }
}
