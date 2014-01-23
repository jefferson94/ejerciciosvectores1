
import java.util.Objects;


/**
 *
 * Clase que modela una cuenta  bancaria.
 */

public class CuentaBancaria implements Comparable {
/**
    
  @param presupuesto parámetro de tipo float que representa el presupuesto activo en la cuenta.
  @param nombreTitular parámetro de tipo String que representa el nombre del titular de la cuenta.
  @param cuentaTipo parámetro de tipo String que representa el tipo de cuenta .
  @param codcuenta parámetro de tipo int que representa el codigo de la cuenta. 
*/

 private Float presupuesto ;
 private String nombreTitular;
 private String cuentaTipo ;
 private int codcuenta;
 
 /**
  * constructor vacio por defecto
  */
 
    public CuentaBancaria() 
    {
        
    }
/**
  * constructor vacio 
  */
    public CuentaBancaria(Float presupuesto, String nombreTitular, String cuentaTipo, int codcuenta) 
    {
        this.presupuesto = presupuesto;
        this.nombreTitular = nombreTitular;
        this.cuentaTipo = cuentaTipo;
        this.codcuenta = codcuenta;
    }

    public Float getPresupuesto() {
        return presupuesto;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public String getCuentaTipo() {
        return cuentaTipo;
    }

    public int getCodcuenta() {
        return codcuenta;
    }

    public void setPresupuesto(Float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void setCuentaTipo(String cuentaTipo) {
        this.cuentaTipo = cuentaTipo;
    }

    public void setCodcuenta(int codcuenta) {
        this.codcuenta = codcuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "presupuesto=" + presupuesto + ", nombreTitular=" + nombreTitular + ", cuentaTipo=" + cuentaTipo + ", codcuenta=" + codcuenta + '}';
    }
 
    @Override
    public int compareTo(Object o) 
    
    {
       
        CuentaBancaria a= (CuentaBancaria)o ;
        
        if (this.getPresupuesto()> a.getPresupuesto()){
             
            return  1 ;
    }
    
        if (this.getPresupuesto()< a.getPresupuesto()){
             
             return  -1 ;
    }
    
               return 0;
}
    

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

   
    @Override
    public boolean equals(Object obj) {
        
        CuentaBancaria a= (CuentaBancaria)obj ;
        
        if (this.presupuesto==a.getPresupuesto()){
        
            
        return true;
    }
        
         return false ;
}

}