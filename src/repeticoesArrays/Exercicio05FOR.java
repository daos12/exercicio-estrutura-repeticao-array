/**
 * FOR
 * Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. 
 * O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
 * Tabuada de 5:
 *  5 X 1 = 5
 *  5 X 2 = 10
 *  ...
 *  5 X 10 = 50
 */
package repeticoesArrays;

import java.util.Scanner;

public class Exercicio05FOR {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual número deseja saber a tabuada? ");
        int numero = scan.nextInt();
        
        for(int i=1; i <=10; i++){
            
            System.out.println(i+" x "+numero+" = "+i*numero);
            
        }
            
    }
    
}
