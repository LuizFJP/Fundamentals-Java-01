import java.util.Scanner;

public class App {

  static int converteChar(char caractere) {
    int numberConverted = 0;
    switch (caractere) {
      case 'I': {
        numberConverted = 1;
        break;
      }
      case 'V': {
        numberConverted = 5;
        break;
      }
      case 'X': {
        numberConverted = 10;
        break;
      }
      case 'L': {
        numberConverted = 50;
        break;
      }
      case 'C': {
        numberConverted = 100;
        break;
      }
      case 'M': {
        numberConverted = 1000;
        break;
      }
    }
    return numberConverted;
  }

  static int arabicSum(int acc, int next) {
    if (acc < next) {
      return next - acc;
    } else {
      return acc;
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);

    String roman = keyboard.next();
    int[] numbersConverted = new int[roman.length()];
    int arabicNumber = 0;

    for (int i = 0; i < roman.length(); i++) {
      numbersConverted[i] = converteChar(roman.charAt(i));
    }

    for (int i = 0; i < numbersConverted.length - 1; i++) {
      arabicNumber += arabicSum(numbersConverted[i], numbersConverted[i + 1]);
    }

    if (numbersConverted[numbersConverted.length - 1] <  numbersConverted[numbersConverted.length - 2]) {
      arabicNumber += numbersConverted[numbersConverted.length - 1];
    }

    System.out.println(arabicNumber);

    keyboard.close();
  }
}
