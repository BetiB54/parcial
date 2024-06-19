
package tienda.de.comestibles;

public class TiendaDeComestibles {

    
    public static double main(String[] args) {
        
        Vegetales vegetal1 = new Vegetales(1, "tomate", 123945732, 14000);
        
        System.out.println("el nuevo vegetal cuesta:"+ vegetal1.calcularDescuento());
        
        
  
            
       double  precio = 0;
       double monto = 0; 
     
                
       double precioFinal;
       
       if (monto>10000){
          precioFinal=(precio*0.9);
          
       }
       else{
           precioFinal=(precio*0.1);
       }
       return precioFinal;
    }    
}
    
    

