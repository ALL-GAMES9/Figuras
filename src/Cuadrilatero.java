/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricas
 */
public abstract class Cuadrilatero {

    protected int x1;
    protected int x2;
    protected int x3;
    protected int x4;
    protected int y1;
    protected int y2;
    protected int y3;
    protected int y4;

    public abstract void Area(double Area);

    public Cuadrilatero(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
    }

}
