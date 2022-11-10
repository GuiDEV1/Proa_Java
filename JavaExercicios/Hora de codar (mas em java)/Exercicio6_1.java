import java.util.Scanner;

public class Exercicio6_1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);    
    
    System.out.println("Digite o primeiro numero");
    int n1 = scan.nextInt();
    System.out.println("Digite o segundo numero");
    int n2 = scan.nextInt();
    System.out.println("Digite o terceiro numero");
    int n3 = scan.nextInt();
    System.out.println("Digite o quarto numero");
    int n4 = scan.nextInt();

    if(n1 == n2 || n1 == n3 || n1 == n4 || n2 == n1 || n2 == n3 || n2 == n4 || n3 == n1 || n3 == n2 || n3 == n4 || n4 == n1 || n4 == n2 || n4 == n3) {
       System.out.println("Por favor não informe valores iguais");
    }
    else if (n1 > n2 && n1 > n3 && n1 > n4) {
       System.out.println(n1 + " foi o maior valor");
    }
    else if (n2 > n1 && n2 > n3 && n2 > n4) {
       System.out.println(n2 + " foi o maior valor");
    }
    else if (n3 > n1 && n3 > n2 && n3 > n4) {
      System.out.println(n3 + " foi o maior valor");
    }
    else {
       System.out.println(n4 + " foi o maior valor");
    }
      
  }
}

