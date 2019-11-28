/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bol11_1;

/**
 *
 * @author doutedasolla
 */
public class Figura {
    
    public  static  final  void main ( String [ ] args )  {
        Clase a =  new Clase ( ) ;
        Clase b =  new Clase ( 20 ) ;
        Clase c =  new Clase ( 20 , 40 ) ;
        
    System . out . println ( "El objeto _A: _ contiene:"  + a.getPrimario () + "," + a.getSecundario ());
    System . out . println ( "El objeto _B: _ contiene:"  + b.getPrimario () + "," + b.getSecundario ());
    System . out . println ( "El objeto _C: _ contiene:"  + c.getPrimario () + "," + c.getSecundario ());
    }
}
    

