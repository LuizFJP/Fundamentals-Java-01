import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner keyboard = new Scanner(System.in);
      keyboard.useDelimiter("\n");

      int iA = keyboard.nextInt();
      int jA = keyboard.nextInt();

      int [][] A = new int[iA][jA];
      for (int i = 0; i < iA; i++) {
        keyboard.useDelimiter("\n");
        for (int j = 0; j < jA; j++) {
          keyboard.useDelimiter(";");
          int number = keyboard.nextInt();
          A[i][j] = number;
        }
      }
// for (int i = 0; i < A.length; i++) {
//   for (int j = 0; j < A.length; j++) {
    
//   }
// }
      keyboard.nextLine();

      System.out.println(A);
      keyboard.close();
    }
}
