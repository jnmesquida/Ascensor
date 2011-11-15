/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ascensor;

/**
 *
 * @author joan
 */
public class Ascensor {
    
    private int[] b;  //Sol·licituds d'aturada interna
    private int[] c; //Sol·licituds d'aturada externes
    private int a; //pis actual de l'ascensor
    private boolean d;

    public Ascensor(int pisos) {
        this.b = new int[pisos];
        this.c = new int[pisos];
        this.a = 0;
        this.d = true;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int[] getB() {
        return b;
    }

    public void setB(int[] b) {
        this.b = b;
    }

    public int[] getC() {
        return c;
    }

    public void setC(int[] c) {
        this.c = c;
    }

    public boolean isD() {
        return d;
    }

    public void setD(boolean d) {
        this.d = d;
    }
    
    public void mou(int pis){
        this.a = pis;
    }   
    
}
