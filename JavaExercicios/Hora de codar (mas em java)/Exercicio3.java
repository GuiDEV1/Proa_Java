import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);    
    
    String nome;
    int idade;

    System.out.println("Digite seu nome: ");
    nome = scan.nextLine();

    System.out.println("Digite sua idade: ");
    idade = scan.nextInt();

    System.out.println("Olá " + nome + " sua idade é de:" + idade + " anos.");
        
    }
     
  }