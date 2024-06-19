
package tienda.de.comestibles;


public class Carnes  extends Comestibles {
    
    private String corte;
    private int proveniente;

    public Carnes(String corte, int proveniente, String nombre, int codigoProducto, double precio) {
        super(nombre, codigoProducto, precio);
        this.corte = corte;
        this.proveniente = proveniente;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    public int getProveniente() {
        return proveniente;
    }

    public void setProveniente(int proveniente) {
        this.proveniente = proveniente;
    }
    

    @Override
    public double calcularDescuento(){
        double descuento;
        
         if (proveniente>1) {
             descuento=(precio*0.9);
             
         }
         else{
             descuento=(precio*0.1);
         }
         return descuento;
    }
}

