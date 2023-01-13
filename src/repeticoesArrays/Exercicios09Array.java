/**
 * ARRAYS MULTIDIMENSIONAIS
 * ?Array Multidimensional: Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. 
 * Após isso determine o menor número da matriz e a sua posição(linha, coluna).
 */
package repeticoesArrays;

import java.util.Random;

public class Exercicios09Array {
    public static void main(String[] args) {
        Random random = new Random();
    
        int[][] m = new int[4][4];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = random.nextInt(9);
            }
        }
        
        System.out.println("Matriz: ");
        for(int[]linha:m){ //vai buscar cada linha
            for(int coluna:linha){
                System.out.print(coluna + "");
            }
            System.out.println("");// pula linha
            

        }
    
    }   
    
}
