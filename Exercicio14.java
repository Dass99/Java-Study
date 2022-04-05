Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;

package principal;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        if(x > y){
            System.out.println(x + " É o maior número" );
        } else if(x < y){
            System.out.print(y + " É o maior número");
        } else {
            System.out.println("São iguais");
        }

    }
}
