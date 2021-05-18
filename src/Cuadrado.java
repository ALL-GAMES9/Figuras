/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricas
 */
public class Cuadrado extends Cuadrilatero {

    private double lado;

    public Cuadrado(double lado, int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        super(x1, x2, x3, x4, y1, y2, y3, y4);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void Area(double Area) {
        Area = lado * lado;
    }

    public void cuadradoDis() {

        System.out.println("Inserta el valor base x1: " + x1);
        System.out.println("Inserta el valor base y1: " + y1);
        System.out.println("Inserta el valor base x2: " + x2);
        System.out.println("Inserta el valor base y2: " + y2);

        lado = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

    }
}
