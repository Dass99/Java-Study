Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a
possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores
trocados;

package principal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
      Scanner input = new Scanner(System.in);
      System.out.println("Informe os valor de a");
        int a = input.nextInt();

      System.out.println("Informe os valor de b");
        int b = input.nextInt();
        int aux = a;
        a = b;
        b = aux;

        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
    }
}
