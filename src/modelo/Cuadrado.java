/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jairo
 */
public class Cuadrado extends FiguraGeometrica {

    public Cuadrado() {
    }

    public Cuadrado(int dimension1) {
        super(dimension1);
    }

    
    @Override
    public double getArea() {
        return this.getDimension1()*this.getDimension1();
    }

    @Override
    public double getPerimetro() {
       return this.getDimension1()*4;
    }
    
    
    
}
