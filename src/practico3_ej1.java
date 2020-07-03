import java.util.Scanner;

public class practico3_ej1 {
    public static void main (String args []) {
        Scanner input = new Scanner(System.in);

        //Práctico 3 - Ejercicio 1
        //Subprograma que llama a método dobleNumero
        System.out.println("Calcular el doble de un número.");
        System.out.println("Ingrese un número..");
        int num = input.nextInt();
        int doble = dobleNumero(num);
        System.out.println("El doble del número ingresado es " + doble);

    }

    
        //Escribir un método que reciba un número y retorne su doble
        public static int dobleNumero (int numero) {
            int doble = numero*2;
            return doble;
        }


}
