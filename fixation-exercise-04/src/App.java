public class App {
    public static void main(String[] args) throws Exception {
      // Considere o trecho de c´odigo a seguir.

      int mes = 12;
      
      switch (mes) {
      case 2:{
      System.out.println("28 dias");
      break;
      }
      case 4:
      case 6:
      case 9:
      case 11: {
      System.out.println("30 dias");
      break;
      }
      default:{
      System.out.println("31 dias");
      }
      }

      System.out.println("a) mes = 2");
      System.out.println("28 dias");
      System.out.println("b) mes = 1");
      System.out.println("31 dias");
      System.out.println("c) mes = 4");
      System.out.println("30 dias");
      System.out.println("d) mes = 6");
      System.out.println("30 dias");
      System.out.println("e) mes = 7");
      System.out.println("31 dias");
      System.out.println("f) mes = 12");
      System.out.println("31 dias");
    }
}
