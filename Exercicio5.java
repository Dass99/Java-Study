Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
No finalinformar o nome do aluno e a sua média (aritmética);

package principal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
      Scanner input = new Scanner(System.in);

      System.out.println("Informe seu nome");
        String nome = input.next();

      System.out.println("Informe nota 1 ");
        int nota1 = input.nextInt();

      System.out.println("Informe nota 1 ");
        int nota2 = input.nextInt();

      System.out.println("Informe nota 1 ");
        int nota3 = input.nextInt();

      int media =  (nota1 + nota2 + nota3)/3;

      System.out.println(nome);
      System.out.println("Sua média foi de : " + media);


    }
}
