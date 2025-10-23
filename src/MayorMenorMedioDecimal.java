import java.util.Scanner;

public class MayorMenorMedioDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double a = sc.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double b = sc.nextDouble();

        System.out.print("Ingresa el tercer número: ");
        double c = sc.nextDouble();

        double mayor = a;
        double menor = a;

        // Comparar para hallar el mayor
        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;

        // Comparar para hallar el menor
        if (b < menor) menor = b;
        if (c < menor) menor = c;

        // Calcular el del medio
        double medio = (a + b + c) - (mayor + menor);

        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
        System.out.println("El número intermedio es: " + medio);

        sc.close();
    }
}

