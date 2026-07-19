import java.util.Scanner;
public class interes {
    public static void main(String[] args) {
            int monto, meses;
            double valorInteres, interes, totalAPagar;
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese el monto:");
                monto = entrada.nextInt();
            System.out.println("Ingrese el número de meses:");
                meses = entrada.nextInt();
            System.out.println("Ingrese el valor de intereses mensual (ejemeplo: 0,02 (20%):");
                valorInteres = entrada.nextDouble();
            interes = monto * valorInteres * meses;
            totalAPagar = monto + interes;
            System.out.println("El interes es: " + interes+ "");
            System.out.println("El total a pagar es: " + totalAPagar + "");

       

        entrada.close();
    }
}
