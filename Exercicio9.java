Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
mês.Considere fixo o juro da poupança em 0,07% a. m;

package principal;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Quanto foi depositado ? ");
        double valorDepositado = input.nextDouble();
        
        double jurosPoupanca = 0.07;
        double rendimento = valorDepositado * jurosPoupanca;
        double valorAtual = valorDepositado + rendimento;

        NumberFormat real = NumberFormat.getCurrencyInstance();

        System.out.println("O valor depositado mais o rendimento de 7% a.m dá um total de: " + real.format(valorAtual));




    }
}
