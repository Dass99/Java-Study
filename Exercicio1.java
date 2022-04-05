1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma;

package principal;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
      Scanner input = new Scanner(System.in);

      System.out.print("Informe o valor de a ");
      int a = input.nextInt();

      System.out.print("Informe o valor de a ");
      int b = input.nextInt();

      System.out.print(a + b);

    }
}
