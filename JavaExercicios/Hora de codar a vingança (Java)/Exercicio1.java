/*
 Autor: Guilherme M. Dias
 programa que ler um valor informado pelo usuário e diz se o valor 
 informado é positivo, negativo ou zero.
 Data: 11/11/2022
 Versão: 1.0
 */

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);    
    
     int valor;

     System.out.println("Informe um valor: ");
     valor = scan.nextInt();

      if (valor < 0) {
        System.out.println("O valor " + valor + " é negativo.");
      }
      else if (valor > 0) {
        System.out.println("O valor " + valor + " é positivo");
      }
      else {
        System.out.println("O valor " + valor + " é igual a 0");
      }
        
    }
     
  }