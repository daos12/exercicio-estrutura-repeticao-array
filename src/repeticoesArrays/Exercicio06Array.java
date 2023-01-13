/**
 * Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
 */
package repeticoesArrays;
public class Exercicio06Array {
    public static void main(String[] args) {
        int[]vetor ={5,4,8,-4,9};
        
        for (int i = 4; i > -1; i--) {
            System.out.println("Decrecente :"+i+" Número: "+vetor[i]);
        }
    }

}
