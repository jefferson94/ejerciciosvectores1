/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovectores1;

/**
 *
 * @author FERNEY JARAMILLO
 */
public class vector {
    
    
 /**
 *
 * Metodo Que soluciona el primer problema planteado sobre la union de tres vectores en uno nuevo sin elementos repetidos
 */

 public int[] unirVector ( int v1[] , int v2 []) {
    
        int n = (v1.length + v2.length);
        int vector1[];
        vector1 = new int [n];
        
        int cont = 0;
        int contLength = 0;

        for (int i = 0; i < v1.length; i++)
        {
            
              contLength++;
            
              for (int j = 0; j < v2.length; j++) 
                  
                   {
                       if (v1[i] == v2[j]) 
                       {
                        vector1[cont] = v1[i];
                        v2[j] = 0;
                        cont++;
                  
                       } 
                        else 
                       {
                       vector1[cont] = v1[i];
                       cont++;

                       }
                  }

        }
        
            if (contLength == v1.length) {
        
                 for (int k = 0; k < v2.length; k++) 
                 {

                     if (v2[k] != 0) 
                     {
                     vector1[cont + 1] = v2[k];
                      }
                                }
            
            }
         return vector1;
       
    }
 /**
 *
 * Metodo Que soluciona el  segundo problema planteado Interseccion de vectores.
 * 
 * 
 */
 
  public int[] intersecciondeVector ( int v1[] , int v2 [], int v3 []) {
       
        int n = (v1.length + v2.length);
        int vector2[];
        int cont =0;
        int contLength=0;
        int repetidos=0;
        vector2 = new int [n];
        
          for (int i = 0; i < v2.length; i++) 
          {
                       for (int j = 0; j < v1.length; j++)  {
                           
                          if (v2[j] == v1[i]) 
                       {
                        vector2[cont] = v1[i];
                        v2[j] = 0;
                        
                        repetidos++;
                       } 
                        else {
                               vector2[cont] = v2[i];
                           } 
                          cont ++;
                    
                   }
              
         if  (contLength==v2.length){
          
                       int   vectorInterseccion[] = new int [n];
                       vectorInterseccion= unirVector (vector2  ,v3 );
      
          }
      
          }
       return  null ;
   
 

  }
  public int [] vensolo2 ( int v1[] , int v2 [], int v3 []){
      int cont ;
      int  n= v1.length;
      int  rep1y2 [] = new int[n] ;
      int  rep1y3 [] = new int[n] ;
      int  rep2y3 [] = new int[n] ;
      int unionRepeat1 []=new int [n+n];
      int m = rep1y2.length;
      rep1y2= repeat(v1,v2);
      rep1y3= repeat (v1,v3);
      rep2y3= repeat (v2,v3);
      unionRepeat1=  unirVector(rep1y2, rep1y3);
      
      int soloven2 []=new int [n+n];
    
      for (int i = 0 , i <m , m++){
     
        for(int j=0 , j<unionrepeat1.length,j++){
        
         if ( rep2y3 [i]!=unionRepeat1[j]){
         
             soloven2[cont]=unionRepeat1[j];
                cont++;
                int h = cont;
         }
  
        }
     
     if ( cont==m)
     {
     
         for (int g =0 , g<rep2y3.length,g++){
         
             soloven2[cont+1]=rep2y3[g];
         
         }
     }
     
     }
     
return soloven2 ;
  
  }

    private int[] repeat(int[] v1, int[] v2) {
      
        int a = v1.length+v2.length;
        int rep[]= new int [a];
        int cont = 0 ;
        
         for ( int i = 0 ; i<v1.length;i++){
         
         for (int j = 0 ; j<v2.length;j++){
         
         
             if ( v1[i]==v2[j]){
             
            rep[cont] =v1[i];
             cont ++;
      
         }
         }
          
         }
        return rep;
        
      
        
     
    }
  
  public int [] vensolo1 ( int v1[] , int v2 [], int v3 []){
       
      
      
      
      /**
       igual que el anterior si no q al momento de compara la primra vez pregunto por los q no se repiten 
       * a lo ultimo si estan en los dos vectores finales no los agrego solo si son unicos
       **/
      
      
      
      return null;
  
  
  }
 
}
  


    
    
  
