import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);    
    
    System.out.println("Digite o primeiro numero");
    int n1 = scan.nextInt();
    System.out.println("Digite o segundo numero");
    int n2 = scan.nextInt();
    System.out.println("Digite o terceiro numero");
    int n3 = scan.nextInt();

     if(n1 == n2 || n1 == n3 || n2 == n1 || n2 == n3 || n3 == n1 || n3 == n2) {
        System.out.println("Por favor não informe valores iguais");
     }
     else if (n1 > n2 && n1 > n3) {
        System.out.println(n1 + " foi o maior valor");
     }
     else if (n2 > n1 && n2 > n3) {
        System.out.println(n2 + " foi o maior valor");
     }
     else {
        System.out.println(n3 + " foi o maior valor");
     }
      
  }
}
