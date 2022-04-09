public class ExerciseFixation {
    public static void main(String[] args) throws Exception {
      int x = 3;
      int y = 16;
      float z = 2.5f;
      String nome1 = "Ana";
      String nome2 = "Paulo";

      System.out.println("a) nome1.equals(nome2)");
      System.out.println(nome1.equals(nome2));
      System.out.println("b) nome1.equals(\"ANA\")");
      System.out.println(nome1.equals("ANA"));
      System.out.println("c) nome2.equals(\"Paulo\")");
      System.out.println(nome2.equals("Paulo"));
      System.out.println("d) x * y + 3");
      System.out.println(x * y + 3);
      System.out.println("e) y / x");
      System.out.println(y / x);
      System.out.println("f) y / z");
      System.out.println(y / z);
      System.out.println("g) y % x");
      System.out.println(y % x);
      System.out.println("h) z < x && z < y");
      System.out.println(z < x && z < y);
      System.out.println("i) !(y % x == 0)");
      System.out.println(!(y % x == 0));

    }
}
