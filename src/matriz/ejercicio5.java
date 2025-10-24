package matriz;

public class ejercicio5 {
    public static void imprime(int[][] matriz) {
        for (int j = 0; j < matriz[0].length; j++) {   // columnas
            for (int i = 0; i < matriz.length; i++) {  // filas
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 4, 5}, {6, 7, 8, 9}
        };

        imprime(matriz);
    }
}