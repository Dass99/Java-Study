A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações sem juros. Faça um
algoritmo que receba um valor de uma compra e mostre o valor das prestações;


package principal;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor da compra, por favor ");
        double compraValor =  input.nextDouble();

        double prestacoes = compraValor/ 5;

        NumberFormat real = NumberFormat.getCurrencyInstance();

        System.out.println("Sua compra pode ser parcelada em até 5 vezes de " + real.format(prestacoes) + " sem juros");
    }
}
