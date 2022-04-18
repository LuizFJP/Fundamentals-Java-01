public class App {

  
    public static void main(String[] args) throws Exception {
      // Considere o trecho de c´odigo a seguir, e as condi¸c˜oes: cond1, cond2, e cond3.
      // 1 if (cond1) {
      // 2 System.out.println("Oi;");
      // 3 System.out.println("Jose;");
      // 4 }
      // 5 if (cond2) {
      // 6 System.out.println("Tudo bem?;");
      // 7  if (cond3) {
      // 8  System.out.println("Maria;");
      // 9  System.out.println("Tchau;");
      // 10 }
      // 11 System.out.println("Ate logo;");
      // 12 System.out.println("Pedro;");
      // 13 }
      // 14 System.out.println("Joao;");
      // Responda o que ser´a impresso na sequˆencia, quando:
      System.out.println("a) cond1 = true; cond2 = false; cond3 = false");
      System.out.println("Oi;");
      System.out.println("Jose;");
      System.out.println("b) cond1 = true; cond2 = true; cond3 = true");
      System.out.println("Oi;");
      System.out.println("Jose;");
      System.out.println("Tudo bem?");
      System.out.println("Maria");
      System.out.println("Tchau");
      System.out.println("Ate logo");
      System.out.println("Pedro");
      System.out.println("Joao");
      System.out.println("c) cond1 = false; cond2 = true; cond3 = false");
      System.out.println("Tudo bem?");
      System.out.println("Ate logo");
      System.out.println("Pedro");
      System.out.println("d) cond1 = true; cond2 = false; cond3 = true");
      System.out.println("Oi");
      System.out.println("Jose");
    }
}
