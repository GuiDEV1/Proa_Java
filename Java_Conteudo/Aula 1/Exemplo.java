import java.util.Scanner;

public class Exemplo {
  public static void main(String[] args) {

    int numero ;
    String nome ;

        System.out.println("Me informe seu nome: ");
        Scanner entrada = new Scanner(System.in);
        nome = entrada.nextLine();

        System.out.println("Digite um numero: ");
        Scanner entrada1 = new Scanner(System.in);
        numero = entrada1.nextInt();


    // numero = numero *5;
    // numero = numero + 5;
    // numero = numero - 1;
    System.out.println("O " + nome + " tem o numero " + numero + " da sorte");

  }
}