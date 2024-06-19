
package tienda.de.comestibles;


public class Conservas extends Comestibles {
    
    private String categoria;
    private int eleccion;

    public Conservas(String categoria, int eleccion, String nombre, int codigoProducto, double precio) {
        super(nombre, codigoProducto, precio);
        this.categoria = categoria;
        this.eleccion = eleccion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEleccion() {
        return eleccion;
    }

    public void setEleccion(int eleccion) {
        this.eleccion = eleccion;
    }
   
     @Override
    public double calcularDescuento(){
        double descuento;
        
         if (eleccion>1) {
             descuento=(precio*0.7);
             
         }
         else{
             descuento=(precio*0.1);
         }
         return descuento;
    }
}
