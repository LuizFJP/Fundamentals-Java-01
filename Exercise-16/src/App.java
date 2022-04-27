import java.util.Scanner;

public class App {

    static double areaQuadrado(double lado) {
      return Math.pow(lado, 2);
    }

    static double areaRetangulo(double base, double altura) {
      return base * altura;
    }

    static double areaCirculo(double raio) {
      return Math.PI * Math.pow(raio, 2);
    }

    static double areaTriangulo(double lado1, double lado2, double lado3) {
      double s = (lado1 + lado2 + lado3) / 2;
      return Math.sqrt(s * (s - lado1) * (s - lado2) *(s - lado3));
    }
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter(";");
        String result = "";
        char method = keyboard.next().charAt(0);

        switch (method) {
          case 'Q': {
            double lado = keyboard.nextFloat();
            result =  String.format("%.2f", areaQuadrado(lado));
            break;
          }
          case 'R': {
            double base = keyboard.nextFloat();
            double altura = keyboard.nextFloat();
            result =  String.format("%.2f", areaRetangulo(base, altura));
            break;
          }
          case 'C': {
            double raio = keyboard.nextFloat();
            result = String.format("%.2f", areaCirculo(raio));
             
            break;
          }
          case 'T': {
            double lado1 = keyboard.nextFloat();
            double lado2 = keyboard.nextFloat();
            double lado3 = keyboard.nextFloat();
            result = String.format("%.2f", areaTriangulo(lado1, lado2, lado3));
            break;
          }
        }
        System.out.println(result);
        keyboard.close();
  }
}
