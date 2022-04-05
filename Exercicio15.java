Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;

package principal;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        if(x >=100 && x <=200){
            System.out.println("Está dentro o intervalo");
        } else if( x < 100){
            System.out.println("Está abaixo do intervalo");
        } else {
            System.out.println("Está acima do intervalo");
        }



    }
}
