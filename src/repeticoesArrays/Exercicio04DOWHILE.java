/**
 * DO-WHILE
 * Par e Ímpar: Faça um programa que peça N números inteiros. 
 * Calcule e mostre a quantidade de números pares e a quantidade de números impares.
 */
package repeticoesArrays;

import java.util.Scanner;

public class Exercicio04DOWHILE {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cont=1, numero=0,par = 0, impar = 0;
        
        System.out.print("Quantos números deseja inserir? ");
        int quantidade = scan.nextInt();
    
        do {
            
            numero = 0;
            
            System.out.print("Digite o "+cont+"º número: ");
            numero = scan.nextInt();
            
            int resto = numero % 2; 
            
            if(resto == 0)par++;
            else impar++;

            cont++;
            
        } while (cont <= quantidade);
        
        System.out.println("Número(s) pare(s) "+par);
        System.out.println("Número(s) impare(s) "+impar);
        
    }
    
    
    
}
