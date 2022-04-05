Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou
mulher. No final informe total de homens e de mulheres;

package principal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
       Scanner input = new Scanner(System.in);

        int M = 0;
        int F = 0;
       for (int i = 0; i <= 56; i++){
           System.out.println("Informe seu nome");
           String nome = input.nextLine().toUpperCase();

           System.out.println("Informe seu sexo");
           String sexo = input.nextLine().toUpperCase();

           if(sexo.equals("MASCULINO")){
                M++;
               System.out.println("Nome: " + nome);
               System.out.println("Sexo: " + sexo + "\n");

           } else if(sexo.equals("FEMININO")){
                F++;
               System.out.println("Nome: " + nome);
               System.out.println("Sexo: " + sexo +"\n" );


           }

      }
       System.out.println("Total de mulheres: " + F);
       System.out.println("Total de homens " + M);
    }
}
