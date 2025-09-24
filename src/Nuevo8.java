import java.util.Scanner;

public class Nuevo8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce  un numero");
        int num1 = scanner.nextInt();

        int multipiclacion=0;
        for (int i = 0; i <=10; i++){
            System.out.println(num1 + " * " + i + " = " + num1 * i);
        }
    }
}
