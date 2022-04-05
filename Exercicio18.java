//18. Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e 
“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;

package principal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        
      for (int i = 0; i <= 2; i++){
            System.out.println("Informe sua idade ");
            int idade = input.nextInt();
            if(idade < 18){
                System.out.println("\nmenor idade\n");
            } else {
                System.out.println("\nmaior de idade\n");
            }
        }
    }
}
