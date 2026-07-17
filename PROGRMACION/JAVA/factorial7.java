import java.util.Scanner;

public class factorial7 {

    public static int factorial(int numero) {

        int contador;
        int acumulador = 1;

        for (contador = 1; contador <= numero; contador++) {
            acumulador = acumulador * contador;
        }

        return acumulador;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n;
        int r;
        int combinacion;
        int permutacion;

        int factorialN;
        int factorialR;
        int factorialNR;

        System.out.print("Ingrese n: ");
        n = teclado.nextInt();

        System.out.print("Ingrese r: ");
        r = teclado.nextInt();

        factorialN = factorial(n);
        factorialR = factorial(r);
        factorialNR = factorial(n - r);

        combinacion = factorialN / (factorialR * factorialNR);
        permutacion = factorialN / factorialNR;

        System.out.println("Combinación: " + combinacion);
        System.out.println("Permutación: " + permutacion);

        teclado.close();
    }
}    
}
