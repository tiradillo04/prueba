package ejerciciosBasicos;

import java.util.Scanner;

public class mayorTresNum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe el primer numero");
        int num1 = sc.nextInt();

        System.out.println("escribe el segundo numero");
        int num2 = sc.nextInt();

        System.out.println("escribe el tercer numero");
        int num3 = sc.nextInt();
// esto sirve para determinar el mayor de los tres
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El mayor es : " + num1);

        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("el mayor es : " + num2);
        } else {
            System.out.println(" el mayor es : " + num3);
        }
        if (num1 <= num2 && num1 <= num3){
            System.out.println(" y el menor es : " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("el menor es : " + num2);


        }else {
            System.out.println("el menor es " + num3);
        }
        sc.close();
    }
}
