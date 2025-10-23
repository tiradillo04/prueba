package matriz;

public class sumamatriz {
    static void main() {
        int[][] matriz = {{9, 8, 7}, {6, 4}};

        System.out.println(sumaTodo(matriz));
    }

    /**
     * comprueba todas las filas y columnas y suma los valores dentro de cada posicion
     *
     * @param matriz la matriz que se suma
     * @return devuelve la suma de todas las posiciones
     */
    public static int sumaTodo(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}
