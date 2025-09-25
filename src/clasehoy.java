import java.util.Scanner;

public class clasehoy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("hola dime tus datos");
        System.out.println("primero dime tu edad");
        int edad= sc.nextInt();
        System.out.println("ahora tu altura");
        double altura=sc.nextInt();
        System.out.println("y tu nombre?");
        String nombre="Manuel";
        boolean estudiante= true ;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
           else{
            System.out.println("Eres menor de edad");
        }
        }

    }

