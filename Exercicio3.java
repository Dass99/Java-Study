3. Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
total percorrida pelo automóvel e o total de combustível gasto;

package principal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
      Scanner input = new Scanner(System.in);

     System.out.println("Informe a distância total percorrida pelo automovel");
     int distanciaPercorrida = input.nextInt();
     
     System.out.println("Informe quanto foi gasto de combustivel durante o percurso");
     int consumo = input.nextInt();

     int consumoMedio = distanciaPercorrida/consumo;
     System.out.println("O consumo médio do automóvel é de " + consumoMedio +"KM/L");

    }
}
