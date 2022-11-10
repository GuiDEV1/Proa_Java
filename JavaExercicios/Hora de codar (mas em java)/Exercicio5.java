import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);    
    
    int numero;

    System.out.println("Digite um numero: ");
    numero = scan.nextInt();

     if (numero < 0) {
        System.out.println("O valor" + numero + " é negativo.");
     }
     else if (numero > 0) {
        System.out.println("o Valor de: " + numero + " é positivo");
     }
     else {
        System.out.println("O valor de: " + numero + " é igual a 0");
     }
        
    }
     
  }