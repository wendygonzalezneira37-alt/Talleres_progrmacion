public class Maleta {
    //Atributos de maleta
    private int peso_maleta;
    private String tamaño_maleta;
    private String contenido_maleta;
    //Constructor
    Maleta(int peso, String tamaño, String contenido){
        peso_maleta = peso;
        tamaño_maleta = tamaño;
        contenido_maleta = contenido; 
    }
    //Metodo
    public void pesar(){
        System.out.println("La maleta peso: "+peso_maleta+"");
    }
    public void medir(){
        System.out.println("La maleta peso: "+tamaño_maleta+"");
    }
    public int getPeso(){
        return peso_maleta;
    }
    public String getTamaño(){
        return tamaño_maleta;
    }
    public String getContenido(){
        return contenido_maleta;
    }

}
