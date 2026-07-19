public class Motor {
    //Atributos del motor
    private double potencia_m;
    private double cilindraje_m;
    private String mantenimiento_m;
    private boolean falla_m;
    //Constructor
    Motor(double potencia, double cilindraje, String mantenimiento, boolean falla){
        potencia_m = potencia;
        cilindraje_m = cilindraje;
        mantenimiento_m = mantenimiento;
        falla_m = falla;
    }
    //Metodo
    public void funcionar(){
        System.out.println("El motor esta funcionando");
    }
    public void fallar(){
        System.out.println("El motor esta fallando");
    }
    public void encender(){
        System.out.println("El motor esta encendiendo");
    }
    public double consumoPorkm = 8;

    //Recursividad
    public double calcularCombustible(int kilometros){ //cada llamada representa un kilometro recorrido
        if(kilometros == 0){
            return 0; 
        }
        return consumoPorkm + calcularCombustible(kilometros - 1);
    }

    public String getMantenimiento(){
        return mantenimiento_m;
    }

    public double getCilindraje(){
        return cilindraje_m;
    }
    public void Despegar(){
            System.out.println("El avión no puede despegar, porque el motor esta fallando.");
        } 
    public boolean estaFallando(){
        return falla_m;
    }
    //Recursividad suponiendo que el nivel de empueje del motor aumenta 
    public int calcularPotencia(int base, int exponente){
        if(exponente == 0){
            return 1; 
        }
        return base * calcularPotencia(base, exponente - 1);
    }
      public void abordar(int x){

        System.out.println("El pasajero puede abordar");
      }

}

