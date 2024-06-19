
package tienda.de.comestibles;


public class Comestibles {
    
   protected String nombre;
   protected int codigoProducto;
   protected double precio;
   
   
   public double calcularDescuento(){
       return 0;
   }
   
   
   
    public Comestibles(String nombre, int codigoProducto, double precio) {
        this.nombre = nombre;
        this.codigoProducto = codigoProducto;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
  
}


