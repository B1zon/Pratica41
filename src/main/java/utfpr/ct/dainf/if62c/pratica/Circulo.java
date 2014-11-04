/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;
/**
 *
 * @author b1zon_000
 */
public class Circulo extends Elipse{
       
       public Circulo(){
             super();
       }    
    
       public Circulo(double raio){
             super(raio,raio);
       }
       @Override
       public double getPerimetro(){
           double P;
           P = 2*Math.PI*super.getR();
           return P;
       }
}
