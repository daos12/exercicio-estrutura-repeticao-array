/**
 * WHILE
 * Nota: Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja 
 * inválido e continue pedindo até que o usuário informe um valor válido.
 */

package repeticoesArrays;
import java.util.Scanner;

public class Exercicio02WHILE {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        while (true) {            
            System.out.print("Entre com uma nota de 0 a 10: ");
            int numero = scan.nextInt();
            
            if (numero < 0 || numero >10) {
                System.out.println("Error, digite novamente!");
            }else{
                System.out.println("Fim sistema");
                break;
            }
        }
    }
}
