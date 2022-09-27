/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tar1ed;

/**
 *
 * @author mamendez
 */
public class Tar1ED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] numeros = new int[5][5];
        int contador = 1;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = contador++;
            }

        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("   " + numeros[i][j]);
            }
            System.out.println("");
        }
        int suma = 0;
        int diagonal1 = 0;
        int diagonal2 = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (i == j) {
                    suma = numeros[i][j];
                    diagonal1 = diagonal1 + suma;

                }

                if ((i + j) == numeros.length - 1) {
                    suma = numeros[i][j];
                    diagonal2 = diagonal2 + suma;
                }
            }

        }
        System.out.println("El total de la primer diagonal es: " + diagonal1);
        System.out.println("El total de la segunda diagonal es: " + diagonal2);

    }
}
