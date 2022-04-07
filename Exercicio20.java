20. A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça 
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O 
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O 
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
Informar total de carros com ano até 2000 e total geral;

package principal;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        double valorAtual,valorAtual1, valor, desconto,valorTotal;
        int carrosAte2000 = 0;
        int carrosPosterior2000 = 0;
        valorAtual = 0;
        valorAtual1 = 0;
        int i = 1;

        while(i > 0){
            System.out.println("Qual o valor do veículo ?");
            valor = input.nextDouble();

            System.out.println("Qual o ano do veículo ?");
            int anoVeiculo = input.nextInt();

            if(anoVeiculo <= 2000){
                desconto = valor * 0.12;
                valor = valor - desconto;
                valorAtual = valorAtual + valor;
                carrosAte2000++;
            }
            else {
                desconto = valor * 0.07;
                valor = valor - desconto;
                valorAtual1 = valorAtual1 + valor;
                carrosPosterior2000++;
            }
            valorTotal = valorAtual + valorAtual1;
            int totalVeiculos = carrosAte2000 + carrosPosterior2000;
            System.out.println("Deseja continuar ?");
            String continuar = input.next().toUpperCase();
            if(continuar.equals("N")){
                System.out.println("Total de carros até os anos 2000: " + carrosAte2000);
                System.out.println("Total de carros adquiridos: " + totalVeiculos);
                System.out.println("total a pagar " + valorTotal);
                i = 0;
            }
        }


    }
}
