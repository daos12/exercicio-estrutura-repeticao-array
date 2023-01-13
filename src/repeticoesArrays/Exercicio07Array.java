/**
 * Consoantes: Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.
 */
package repeticoesArrays;

import java.util.Scanner;

public class Exercicio07Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] consoantes = new String[6];
        int quantidade = 1;
        
        int cont = 0,quantidadeConsoante=0;
        do {        

            System.out.println("Letra:");
            String letra = scan.next();
            
            if(!(letra.equalsIgnoreCase("a")|
                (letra.equalsIgnoreCase("e")|
                (letra.equalsIgnoreCase("i")|
                (letra.equalsIgnoreCase("o")|
                (letra.equalsIgnoreCase("u"))))))){
                             
                consoantes[cont] = letra;
                quantidadeConsoante++;
            }
            
            cont++;
            
        } while (cont < consoantes.length);
        
        System.out.println("Consoantes:");
        for (String consoante:consoantes) {
            if(consoante != null)
                System.out.print(consoante +" ");
        }  
    }
}

