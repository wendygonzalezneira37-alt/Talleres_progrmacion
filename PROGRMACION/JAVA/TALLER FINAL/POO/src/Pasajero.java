public class Pasajero{
    //Atributos (El pasajero tendra una fecha de nacimiento, un nombre, y un destino)
    private String fecha_nacimiento;
    private String nombre;
    private String destino;
    Maleta bag;
    //Constructor: crea o inicializa un objeto 
    Pasajero(String fecha, String nme, String destin){
        fecha_nacimiento = fecha;
        nombre = nme;
        destino = destin;
    } 
    //Metodo (El pasajero va a abordar)
    public String getPasajero(){
        return nombre;
    }
    public String getDestino(){
        return destino;
    }
  
    //Metodo (El pasajero va a esperar)
    public void esperar(){
        System.out.println("La persona "+nombre+" esta esperando");
    }
    public void tener(int x){
        if(x==1){
                bag = new Maleta(10, "55×35×25cm", "Ropa");
                System.out.println("El pasajero "+ nombre +" tiene una maleta de "+ bag.getPeso() +" kg, con unas dimensiones de " + bag.getTamaño() + " y el contenido es " + bag.getContenido()+ ".");
                System.out.println("El pasajero " +nombre+ " puede abordar con su equipaje.");
        }else{System.out.println("La persona "+nombre+" no tiene maleta");

        }
    }
    public void volar(Motor motor){

        if (motor.estaFallando()){
                System.out.println("El pasajero " +nombre+ " no puede volar porque el motor esta fallando.");   
        }else{
            System.out.println("El pasajero " + nombre + "puede abordar el vuelo.");

        }
    }

    }
        

