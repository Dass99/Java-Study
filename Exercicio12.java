O custo de um carro novo ao consumidoré a soma do custo de fábrica mais o percentual do distribuidor e
dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
mesmo;


package principal;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o custo de fábrica do veículo");
        double custoDeFabrica =  input.nextDouble();
        double impostos = 0.45;
        double percentualDistr = 0.28;

        double custoAtual = custoDeFabrica * impostos;
        custoDeFabrica = custoDeFabrica + custoAtual;
        double custoFinal = custoDeFabrica * percentualDistr;
        custoFinal = custoDeFabrica + custoFinal;

        NumberFormat real = NumberFormat.getCurrencyInstance();
        System.out.println("O custo ao consumidor será de " + real.format(custoFinal));



    }
}
