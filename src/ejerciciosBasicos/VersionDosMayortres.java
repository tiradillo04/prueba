package ejerciciosBasicos;

import java.util.Scanner;

public class VersionDosMayortres {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ingresa primer numero :  ");
        int num1 = sc.nextInt();

        System.out.println("ingresa segundo numero:  ");
        int num2 = sc.nextInt();

        System.out.println(" ingresa tercer numero:  ");
        int num3 = sc.nextInt();

        int mayor = num1; // asumimos que num1 es el mayor
        int menor = num1; // asumimos que num1 es el menor
        int medio = (num1 + num2 + num3) - (mayor + menor);


        // comprobaciones para encontrar el mayor

        if (num2 > mayor) mayor= num2;
        if (num3 > mayor) mayor= num3;

        // comprobacines para encontrar al menor

        if (num2 < menor) menor = num2;
        if (num3 < menor) menor = num3;

        System.out.println(" el numero mayor es :  "+ mayor);
        System.out.println("el numero menor es :  " + menor);
        System.out.println("El número intermedio es: " + medio);

        sc.close();
    }

}
