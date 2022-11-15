import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
        int n1, n2;
        int media = 0;
        // Array para guarda a quantidade e valores do usuário
        ArrayList<Integer> numbers = new ArrayList<Integer>();

         // Entrada de dados dos valores do ususário
         System.out.println("Digite o primeiro valor: ");
         n1 = scan.nextInt();

         System.out.println("Digite o segundo valor: ");
         n2 = scan.nextInt();
          // verifiando se o primeiro valor é menor q o segundo
          if(n1 < n2) {

            for (int i = n1; i <= n2; i++) {
                numbers.add(i);
                // somando os valores dentro do for  
                media += i;
             }

             System.out.println("A média entre os dois numeros informados pelo usuário foi de: " + 
             (media / numbers.size()));
          }
         else {
            System.out.println("O primeiro valor tem que ser menor que o segundo!");
         } 
    }

}
