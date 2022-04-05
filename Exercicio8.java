Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valorlido em
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares
disponíveis com ousuário;

package principal;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Informe quantos dólares você tem ? ");
        double dolar = input.nextDouble();

        System.out.println("Quanto está a cotação do dolar hoje ? ");
        double cotacaoDolar = input.nextDouble();

        NumberFormat real = NumberFormat.getCurrencyInstance();

        System.out.println("US$ " + dolar + " equivale a " + real.format(cotacaoDolar*dolar));



    }
}
