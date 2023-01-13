/*
 * WHILE
 * Nome e Idade: Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo representando a sua idade.
 * (Pare o programa inserindo o valor 0 no campo nome)
 */

package repeticoesArrays;
import java.util.Scanner;

public class Exercicio01WHILE {
    public static void main(String[] args) {
        
        String nome;
        int idade;
        
        Scanner scanner = new Scanner(System.in); 
        
        while(true){
            
            System.out.println("Entre com o seu nome: ");
            nome = scanner.next();
            
            if(nome.equals("0"))break;

            System.out.println("Entre com a sua idade: ");
            idade = scanner.nextInt();
        }
        System.out.println("opa ");
    }
}
