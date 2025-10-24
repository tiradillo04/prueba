package matriz;

public class ejercicio6matriz {
    public static void imprimeporindice(int[][] matriz) {
        for (int j= matriz[0].length - 1 ; j >= 0; j--) {   // columnas
            for (int i= matriz.length - 1 ; i >= 0; i--) {  // filas
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }

     static void main(String[] args) {
        int[][] matriz = {{1, 2, 4, 5}, {6, 7, 8, 9}
        };

        imprimeporindice(matriz);
    }
}