

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ricas
 */
public class Trapecio extends Cuadrilatero {

    private double baseM;
    private double basem;
    private double altura;

    public Trapecio(double baseM, double basem, double altura, int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
        super(x1, x2, x3, x4, y1, y2, y3, y4);
        this.baseM = baseM;
        this.basem = basem;
        this.altura = altura;
    }

    @Override
    public void Area(double Area) {
        Area = (baseM + basem) * altura / 2;
    }

    public double getBaseM() {
        return baseM;
    }

    public void setBaseM(double baseM) {
        this.baseM = baseM;
    }

    public double getBasem() {
        return basem;
    }

    public void setBasem(double basem) {
        this.basem = basem;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    
    
}
