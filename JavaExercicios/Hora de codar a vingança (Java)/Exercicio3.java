import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        int valor1;
        int valor2; 
        int valor3;

        System.out.println("Digite o primeiro valor: ");
        valor1 = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        valor2 = scan.nextInt();

        System.out.println("Digite o terceiro valor: ");
        valor3 = scan.nextInt();


        // Condição para saber o valor menor

         if(valor1 < valor2 && valor1 < valor3) {
            System.out.println("A soma dos maiores numeros foi de: " + (valor2 + valor3));
         }
         else if (valor2 < valor1 && valor2 < valor3) {
            System.out.println("A soma dos maiores numeros foi de: " + (valor1 + valor3));
         }
         else {
            System.out.println("A soma dos maiores numeros foi de: " + (valor1 + valor2));
         }
    }

}
