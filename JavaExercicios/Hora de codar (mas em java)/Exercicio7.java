import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);    
    
    System.out.println("Digite primeiro valor: ");
    int valor1 = scan.nextInt();

    System.out.println("Digite segundo valor: ");
    int valor2 = scan.nextInt();

    System.out.println("Digite o terceiro valor: ");
    int valor3 = scan.nextInt();

    int calc;
   
    if (valor1 < valor2 && valor1 < valor3) {
           calc = valor2 + valor3;
           System.out.println("A soma dos dois maiores são:" + calc);
    }
    else if(valor2 < valor1 && valor2 < valor3) {
         calc = valor1 + valor3;
         System.out.println("A soma dos dois maiores são:" + calc);
    }
    else {
      calc = valor2 + valor1;
      System.out.println("A soma dos dois maiores são:" + calc);
    }
          
  }
}

