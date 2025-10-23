package matriz;

public class ejerccioMatriz {
    static void main() {
        int[][] matriz = {{1,2,3,4,5,6}, {6,-5,3,8,4,9}};
        System.out.println(encuetronNegativo(matriz));
    }

    private static boolean encuetronNegativo(int [] [] matriz){
        boolean encontrado = false;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[1].length; j++ ){
                if (matriz[i][j]< 0){
                    encontrado = true;
                    break;
                }
            }
        }
        return encontrado;
    }
}
