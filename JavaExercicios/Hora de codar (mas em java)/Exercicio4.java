import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);    
    
    int escolha;

    System.out.println("Escolha um numero de 1 a 7 para ver os calculos e seus resultados|  1 - Retangulo | 2 - quadrado | 3 Losango | 4 - Trapezio | 5 - paralelogramo | 6 - triangulo | 7 - circulo");
    escolha = scan.nextInt();
     
      if (escolha == 1) {
         int base;
         double altura;

         System.out.println("Informe a base: ");
         base = scan.nextInt();

         System.out.println("Informe a altura: ");
         altura = scan.nextDouble();

         System.out.println("O resultado da base x altura é: " + (base * altura));
      }
     else if (escolha == 2) {
        int lado;
        int res;
        System.out.println("Informe o valor do lado do quadrado: ");
        lado = scan.nextInt();

        res = (lado * lado);
        System.out.println("O resultado do lado do quadrado é: " + res);
     } 
     else if (escolha == 3) {
        double dMaior;
        double dMenor;
        double res;

        System.out.println("infome o valor da diagonal maior: ");
        dMaior = scan.nextDouble();
        System.out.println("infome o valor da diagonal menor: ");
        dMenor = scan.nextDouble();

        res = (dMaior * dMenor) / 2;

        System.out.println("O resultado do losango é: " + res);
     }
     else if (escolha == 4) {
       int bMaior;
       int bMenor;
       float altura;
       double res;

       System.out.println("Informe a base maior: ");
       bMaior = scan.nextInt();
       System.out.println("Informe a base menor: ");
       bMenor = scan.nextInt();
       System.out.println("Informe a altura: ");
       altura = scan.nextFloat();

       res = (bMaior + bMenor) * altura / 2;

       System.out.println("o valor do trapézio foi de: " + res);
     }
     else if (escolha == 5) {
        int base;
        float altura;

        System.out.println("Informe a base: ");
        base = scan.nextInt();
        System.out.println("Informe a altura: ");
        altura = scan.nextFloat();

        System.out.println("O valor do paralelogramo foi de: " + (base * altura));
     }  
     else if (escolha == 6){
         int base;
         float altura;

         System.out.println("Informe o valor da base: ");
         base = scan.nextInt();

         System.out.println("Informe o valor da altura: ");
         altura = scan.nextFloat();

         System.out.println("O valor do triangulo foi de:" + (base * altura) /2);
     } 
     else if(escolha == 7) {
       double pi = 3.14;
       double raio;
       double res;

       System.out.println("Informe o valor do raio do circulo: ");
       raio = scan.nextDouble();
       res =  pi * (raio * raio);

       System.out.println("O valor do circulo é: " + res);
     }   
    }
     
  }