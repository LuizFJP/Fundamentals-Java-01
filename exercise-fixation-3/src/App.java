public class App {
  public static void main(String[] args) throws Exception {
    // Considere o trecho de c´odigo a seguir, e as condi¸c˜oes: condA, condB, condC
    // e condD.
    // boolean condA;
    // boolean condB;
    // boolean condC;
    // boolean condD;

    // System.out.println("Inicio;");
    // if (condA) {
    //   System.out.println("CEAVI;");
    //   if (condD) {
    //     System.out.println("Oi;");
    //   }
    // } else {
    //   if (condB) {
    //     System.out.println("Prog1;");
    //     if (condC) {
    //       System.out.println("Ibirama;");
    //     } else {
    //       System.out.println("SC;");
    //     }
    //     System.out.println("UDESC;");
    //   }
    //   System.out.println("Fim;");
    // }
    // Responda o que ser´a impresso na sequˆencia, quando:
    System.out.println("a) condA = true; condB = true; condC = false; condD = false");
    System.out.println("Inicio;");
    System.out.println("CEAVI;");
    System.out.println("b) condA = false; condB = false; condC = true; condD = true");
    System.out.println("Inicio;");
    System.out.println("Fim;");
    System.out.println("c) condA = false; condB = true; condC = true; condD = true");
    System.out.println("Inicio;");
    System.out.println("Prog1;");
    System.out.println("Ibirama;");
    System.out.println("UDESC;");
    System.out.println("Fim;");
  }
}
