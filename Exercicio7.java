Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de
conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;

package principal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe quanto graus Celsius deseja converter");
        double celsius = input.nextDouble();

        double farenheit = (9*celsius + 160)/5;
        System.out.println("na escala celsius: " + celsius);
        System.out.println("Na escala farenheit: " + farenheit);



    }
}
