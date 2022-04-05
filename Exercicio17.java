Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150
(inclusive);

package principal;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        int i = 80;
        int contador = 0;
        while(i > 0){
            System.out.println("Informe um número ");
            int n = input.nextInt();
            if(n >= 10 && n <=150){
                contador++;
            }
            i--;
        }
        System.out.println("A quantidade de numeros que atendem a condição é " + contador);
    }
}

