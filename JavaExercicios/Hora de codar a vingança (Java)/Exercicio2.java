import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);    
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int valor;

         for(int i = 0; i < 3; i++) {
            System.out.println("Informe um valor: ");
            valor = entrada.nextInt();

            numbers.add(valor);
         }   
        
         int maior = Collections.max(numbers);
         
         System.out.println("O maior numero informado é: " + maior);

 }     
}
