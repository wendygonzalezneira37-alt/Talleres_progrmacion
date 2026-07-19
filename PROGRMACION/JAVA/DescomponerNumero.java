import java.util.Scanner;

public class DescomponerNumero {
    public static void descomponer(int x) {   // Función para descomponer un número en factores primos

        int divisor = 2;

        while (x > 1) {

            if (x % divisor == 0) {
                System.out.println(divisor);
                x = x / divisor;
            } else {
                divisor++;
            }

        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int x;

        System.out.println("Ingrese un número:");
        x = teclado.nextInt();

        System.out.println("Los factores primos son:");

        descomponer(x);

        teclado.close();
    }
}
