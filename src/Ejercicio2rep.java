import java.util.Scanner;

public class Ejercicio2rep {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un numero para multiplicarlo");
        int num1 = scanner.nextInt();


        int multiplicacion=0;
        for (int i = 0 ; i  <=500; i++){
            System.out.println(num1 + "*" + i + "=" + num1 * i );
        }


    }

}
