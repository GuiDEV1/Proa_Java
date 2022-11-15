import java.util.Scanner;
import java.util.ArrayList;


public class Exercicio4 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); 
    float nota1, nota2;
    String name;
    String escolha;
    float res;
    ArrayList<Float> alunos = new ArrayList<Float>();
    
     System.out.println("Gostaria de verificar a nota de algum aluno digite: S/N");
     escolha = scan.next();

 while(!"n".equals(escolha)) {
     
    System.out.println("Digite a primeira nota do aluno ");
    nota1 = scan.nextFloat();

    System.out.println("Digite a segunda nota do aluno ");
    nota2 = scan.nextFloat();

    res = (nota1 + nota2) / 2;
    
     if(res >= 6.5 && res <=10) {
      System.out.println("O aluno(a): foi aprovado com a média " + Math.round(res));
      alunos.add(res);
     }
     else if (res < 6.5 && res > 0) {
      System.out.println("O aluno(a): foi reprovado com a média " + Math.round(res));
     }
     else {
      System.out.println("Erro tente novamente!");
     }

     System.out.println("Gostaria de verificar a nota de algum aluno digite: S/N");
     escolha = scan.next();
 } 

 System.out.println("A quantidade de alunos aprovados foram de: " + alunos.size());

    }
}
