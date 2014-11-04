/**
 * @author Gabriel Rodrigues Garcia <b1zon@hotmail.com>
 */

import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;

public class Pratica41 {
    public static void main(String[] args) {
        Elipse E1 = new Elipse(4.0,5.0);
        Elipse E2 = new Elipse(6.0,7.0);
        Circulo C1 = new Circulo(4.0);
        Circulo C2 = new Circulo(7.0); 
        System.out.println("Área Elipse1: "+E1.getArea());
        System.out.println("Perimetro Elipse1: "+E1.getPerimetro());
        System.out.println("Área Elipse2: "+E2.getArea());
        System.out.println("Perimetro Elipse2: "+E2.getPerimetro());
        System.out.println("Área Circulo1: "+C1.getArea());
        System.out.println("Perimetro Circulo1: "+C1.getPerimetro());
        System.out.println("Área Circulo2: "+C2.getArea());
        System.out.println("Perimetro Circulo2: "+C2.getPerimetro());
    }
}
