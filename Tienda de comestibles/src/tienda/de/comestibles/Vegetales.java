
package tienda.de.comestibles;


public class Vegetales extends Comestibles {
    
    private int tipo;

    public Vegetales(int tipo, String nombre, int codigoProducto, double precio) {
        super(nombre, codigoProducto, precio);
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    

    
     @Override
    public double calcularDescuento(){
        double descuento;
        
         if (tipo > 1) {
             descuento=(precio*0.3);
             
         }
         else{
             descuento=(precio*0.1);
         }
         return descuento;
    }
}
