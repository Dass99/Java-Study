2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
dos dois números lidos;

package principal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
      Scanner input = new Scanner(System.in);

      System.out.print("Informe o valor de a ");
      int a = input.nextInt();

      System.out.print("Informe o valor de a ");
      int b = input.nextInt();

      int soma = a + b;
      int subtracao = a - b;
      int multiplicacao = a * b;
      int divisao = a / b;

      System.out.println("a + b = " +soma);
      System.out.println("a - b = " + subtracao);
      System.out.println("a x b = " + multiplicacao);
      System.out.println("a % b =  " + divisao);

    }
}
