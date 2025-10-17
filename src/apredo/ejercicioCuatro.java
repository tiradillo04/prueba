package apredo;

import java.util.Scanner;

public class ejercicioCuatro {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un numero");
        int num = sc.nextInt();

        if (num >= 0 && num <= 100) {
            System.out.println("El numero esta dentro del rango(0 a 100)");
            if (num % 2 == 0) {
                System.out.println("ademas el numero es par");

            } else {
                System.out.println("ademas el numero es impar");
            }
        } else {
            System.out.println("El numero esta fuera del rango (o a 100)");


        }
        sc.close();
    }


}
