import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu primer numero: ");
        int numA = sc.nextInt();

        System.out.println("Introduce tu segundo numero: ");
        int numB = sc.nextInt();

        int total = 0;
        for (int i = 0; i < numB; i++) {
            total += numA;
            if (numB < 0) total= -total;
        }

        System.out.println("El resultado es " + total);
    }
}



