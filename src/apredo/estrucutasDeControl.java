package apredo;

public class estrucutasDeControl {
     static void main(String[] args){
    // " if " se ejecuta solo si la solucion es verdadera y " else " si es falsa ( se pueden anidar)
         int n1 = 10;
         int n2 = 15;

         if(n1>n2){
             System.out.println("n1 es mayor que n2");// si lo que escribo es cierto se mostrara el resultado del IF
         } else {
             System.out.println("n2 es mayor que n1");// si es falso se mostrara el del else , en pantalla
             //  se muestra else porque (n1>n2) es falso
         }
    }

}
