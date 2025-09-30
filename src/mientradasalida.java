import java.util.Scanner;

public class mientradasalida {
    private static Scanner sc = new Scanner((System.in));

    /**
     * lee un entero mostrando el mensaje pasado como parametro
     * @param mensaje El mensaje a mostrar
     * @return el entero leido por teclado
     */
    public static int leerEntero(String mensaje) {
        System.out.println("introduce un numero:");
        return sc.nextInt();
    }

    public static int leerEnteroPositivo(String mensaje ){
        System.out.println(mensaje);
        int a = sc.nextInt();
        while (a < 0) {
                System.out.println("introduce un numero que sea positivo");
        a = sc.nextInt();

    }
        return a;

    }
public static void  main(String[] args){
    int a = mientradasalida.leerEntero("introduce un numero");
    System.out.printf("el numero introducido es %d" , a);
    }
}
