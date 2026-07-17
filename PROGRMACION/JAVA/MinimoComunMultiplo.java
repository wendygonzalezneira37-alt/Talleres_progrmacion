import java.util.Scanner;  //En java siempre se empieza asi
public class MinimoComunMultiplo {
    public static int MCD(int x1,int x2){  //Función con datos enteros
        int divisor;  //definir variables con el tipo de dato
        int menor; 
        int respuesta = 1;
        if (x1 < x2){
            menor = x1;
        }else {
            menor = x2;
        }
        for (divisor =1; divisor <= menor; divisor++){ //el ciclo desde donde tomara los divisores desde 1 hasta el menor
            if (x1 % divisor == 0 && x2 % divisor == 0){  // si el residuo entre x1 y x2 es 0 el MCD es el divisor
                respuesta = divisor;
            }

        }

    return respuesta;
    } 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
// definir variables
         int x1;
         int x2;
         int resultado;
         int mcm;
// leer los datos
         System.out.println ("Ingrese el primer número:");
         x1 = teclado.nextInt();
         System.out.println("Ingrese el segundo número:");
         x2 = teclado.nextInt();

         while (x1 > 0 && x2 > 0){
            resultado = MCD(x1, x2);
            mcm = (x1 * x2)/ resultado;

            System.out.println("El MCM es: " +mcm);

            System.out.println ("Ingrese el primer número:");
            x1 = teclado.nextInt();
         
            System.out.println("Ingrese el segundo número:");
            x2 = teclado.nextInt();
         }
    }


}