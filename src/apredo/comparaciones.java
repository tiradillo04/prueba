package apredo;

public class comparaciones {
     public static void main(String[] args) {
        int numero1 = 27;
        int numero2 = 15;
         System.out.println("¿ el 27 es mayor que el 15? : " + (numero1 > numero2)); // ">" indica que numero1 es mayor que numero2 y cuando ejecute me dira si es verdadero o falso
         System.out.println("¿ el 27 es igual que el 15? : " + (numero1 == numero2)); // "==" indica que son iguales y cuando ejecute me dira si es cierto o no
         System.out.println("¿ el numero 27 es distinto que el 15? : " + (numero1 != numero2));// "!=" indica que son distintos cuando ejecute dira si es cierto o no
         System.out.println("¿ el numero 27 es mayor que 15 y 15 es mayor que 0? : " + ((numero1> numero2) && (numero2>0))) ;// hace que las dos condiciones sean verdaderas si una de las dos es falsa sera el resultado sera falso.
    }
}
