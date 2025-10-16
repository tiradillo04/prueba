package apredo;

public class calculadoraBasicados {
    static void main(String[] args) {
        int num1 = 27;// hace que el numero 27 tenga
        int num2 = 15;

        System.out.println("Suma: " + (num1 + num2));//suma el num1 al num2
        System.out.println("Resta: " + (num1 - num2));// resta num1 - num2
        System.out.println("Multiplicación: " + (num1 * num2));// multiplica num1*num2
        System.out.println("División: " + ((double) num1 / num2));
        //hace division de num1 entre num2 (se utiliza el double para que de decimal)
        System.out.println("Módulo: " + (num1 % num2));//hace el modulo de la division entre num1 y num2

    }
}
