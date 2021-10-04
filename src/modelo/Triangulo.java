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
public class Triangulo extends FiguraGeometrica  {
    private int altura;

    public Triangulo() {
    }

    public Triangulo(int altura, int dimension1) {
        super(dimension1);
        this.altura = altura;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return this.altura * this.getDimension1() / (double)2;
    }

    @Override
    public double getPerimetro() {
        return 0;// pendiente implementar;
    }
    
    
}
