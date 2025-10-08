public class EJERCICIO4BOLETIN2 {
    public static void main(String[] args) {

    }

    public static int generarAleatorio (int max) {
        int numAleatorio = (int) (Math.random()* max + 1);


        return numAleatorio;
    }

    public static int generarAleatorio (int min , int max) {

        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
