//faça um algoritmo que recebe o nome e 3 notas do aluno, calcule a média aritmética e 
//ao final imprima reprovado para média < 7, aprovado média > 7 
//e em recuperação para média entre 5.1 r 6.9

public class Main {

    public static void main(String[] args) {
        // write your code here
    float n1,n2,n3, media;
    String nome;

    Scanner input = new Scanner(System.in);

    System.out.println("Informe seu nome");
    nome = input.next();

    System.out.println("Informe nota 1");
    n1 = input.nextFloat();

    System.out.println("Informe nota 2");
    n2 = input.nextFloat();

    System.out.println("Informe nota 3");
    n3 = input.nextFloat();

    media = (n1 + n2 + n3)/3;

    if (media >= 7){
        System.out.println(nome + " " + "Aprovado");
    }else if( media >= 5.1f && media <= 6.9f){
        System.out.print(nome + " " + "Em recuperação");
    } else {
        System.out.println(nome + " " +"Reprovado" );
    }

    }
}