Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas, informar o seu nome, o salário fixo e salário no final do mês;


package principal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
      Scanner input = new Scanner(System.in);
      System.out.println("Informe seu nome :");
      String nome = input.next();

      System.out.println("Informe seu salário :");
      double salarioFixo = input.nextDouble();

      System.out.println("Informe quantas vendas você efetuou(em dinheiro)");
      int totalDeVendas = input.nextInt();
      double comissao = totalDeVendas *  0.15;
      double salarioFinal = salarioFixo + comissao;

      System.out.println(nome);
      System.out.println("Salário fixo: R$" + salarioFixo);
      System.out.println("Salário mensal R$" + salarioFinal);
    }
}
