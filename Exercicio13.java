Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
package principal;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        if(n > 10){
            System.out.println("O número digitado é maior que 10");
        } else if(n == 10){
            System.out.println("O número digitado é igual a 10");
        } else{
             System.out.println("O número digitado e menor que 10");
        }
    }
}
