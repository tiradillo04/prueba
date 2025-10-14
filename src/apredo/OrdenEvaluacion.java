package apredo;

public class OrdenEvaluacion {
    static void main(String[] args) {
        int resultado = 5 + 3 * 2;
        System.out.println("el resultado sin parentesis es = " + resultado);// el resultado es 11, porque se hace 3*2 y luego 5 + 6

        int resultadodist = (5+3) * 2; // es 16 porque el 2 se multiplica por el parentesis.
        System.out.println("el resultado con parentesis es = " +  resultadodist);
    }
}
