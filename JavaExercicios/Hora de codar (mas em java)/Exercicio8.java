import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);    
    int n1;
    int n2;
    double res;

  System.out.println("Digite o primeiro valor: ");
  n1 = scan.nextInt();

  System.out.println("Digite o segundo valor: ");
  n2 = scan.nextInt();

  while(n2 == 0 || n2 < 0) {
    System.out.println("O valor nao pode ser 0! ");
     
    System.out.println("Digite o primeiro valor: ");
    n1 = scan.nextInt();

    System.out.println("Digite o segundo valor: ");
    n2 = scan.nextInt();
  }

   res = (n1 / n2);

   System.out.println("A divisão do numero1 pelo numero 2 é: " + res);


  


 

          
  }
}


