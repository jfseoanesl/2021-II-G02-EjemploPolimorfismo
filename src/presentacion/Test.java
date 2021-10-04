/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import modelo.*;

/**
 *
 * @author jairo
 */
public class Test {
    public static void main(String[] args) {
        
        FiguraGeometrica figuras[] = new FiguraGeometrica[2];
        
        FiguraGeometrica c = new Cuadrado(10);
        imprimirValores(c);
        
        FiguraGeometrica t = new Triangulo(10,20);
        imprimirValores(t);
        
        FiguraGeometrica ci = new Circulo();
        imprimirValores(ci);
        
    }
    
    public static void imprimirValores(FiguraGeometrica figura){
        System.out.println("Area de la figura: " + figura.getArea());
        System.out.println("Perimetro de la figura: " + figura.getPerimetro());
    }
    
}
