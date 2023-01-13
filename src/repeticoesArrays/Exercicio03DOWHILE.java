/**
 * DO-WHILE
 * Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.
 */
package repeticoesArrays;
import java.util.Scanner;

public class Exercicio03DOWHILE {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int cont = 1;
        double numero=0,total=0, maior=0, media=0;
        
        do{
            System.out.print("Entre com o "+cont+"º numero: ");
            numero = scan.nextInt();
            
            total += numero;   
         
            if(numero > maior){
                maior = numero;
            }
            cont++;

        }while(cont <= 5);
        
        media = total / 5;
        
        System.out.println("Média das notas: "+media);
        System.out.println("Maior das notas: "+maior);
        System.out.println("Total das notas: "+total);    
    }
}
