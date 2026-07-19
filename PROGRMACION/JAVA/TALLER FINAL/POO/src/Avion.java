import java.util.Scanner;
public class Avion{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        //Asignarles los atributos al pasajero
        Pasajero w = new Pasajero("03/07/1997", "Wendy Gonzalez", "Brasil");
        Pasajero i = new Pasajero("19/10/1987", "Ivan Vallejo", "China");

        //Asignarle los atrubutos al motor
        Motor a1 = new Motor(115000.0, 30190, "01/01/2026", false);
        Motor a2 = new Motor(10000, 1190, "01/01/2025", true);

        //vuelo Brasil
        System.out.println("VUELO 1 COLOMBIA - BRASIL");

        System.out.println("Pasajero " + w.getPasajero() +" con destino a " + w.getDestino() +".");
        w.tener(1);

        System.out.println("CONDICIONES DE VUELO");

        int kilometrosBrasil = 4150; /// kilometraje hasta brasil
        double combustible = a1.calcularCombustible(kilometrosBrasil);
        System.out.println("Para un trayecto de " + kilometrosBrasil + " km hasta Sao Pablo, Brasil, se necesitan " + combustible + " litros de combustible.");
        System.out.println("El último mantenimiento del motor fue:" + a1.getMantenimiento() + ". ");
        a1.funcionar();
        a1.encender();

        System.out.println("ABORDAJE");
        w.volar(a1);
       

        //Vuelo a China

        System.out.println("VUELO 2 COLOMBIA - CHINA");

        System.out.println("Pasajero " + i.getPasajero() +" con destino a " + i.getDestino() +".");
        i.tener(0);

        System.out.println("CONDICIONES DE VUELO");
        
        int kilometrosChina = 14900; //kilometraje desde Colombia a China
        double combustible2 = a2.calcularCombustible(kilometrosChina);
        System.out.println("Para un trayecto de " + kilometrosChina + " km hasta Pekin, China, se necesitan " + combustible2 + " litros de combustible, sin embargo, el cilindraje del motor es de " + a2.getCilindraje() + " litros. ");
        int potencia = a2. calcularPotencia(2,5);
        System.out.println("La potencia requerida es: "+ potencia);
        System.out.println("El último mantenimiento del motor fue:" + a2.getMantenimiento() + ". ");
    

        System.out.println("ABORDAJE");
         i.volar(a2);
    }




}
