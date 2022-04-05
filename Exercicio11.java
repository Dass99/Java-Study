Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;

package principal;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o preço de custo");
        double precoDeCusto =  input.nextDouble();

        System.out.println("Informe quantos porcento deseja lucrar com o produto ");
        double margenDeLucro = input.nextDouble()/100;
        double precoDeVenda = precoDeCusto * margenDeLucro;
        precoDeVenda = precoDeVenda + precoDeCusto;

        NumberFormat real = NumberFormat.getCurrencyInstance();
        System.out.println("Preço de venda: " + real.format(precoDeVenda));

    }
}
