/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angel.racionalangelsamuel;

/**
 *
 * @author angel
 */
public class Racional {

    private int a, b;

    public Racional() {
        this.a = 1;
        this.b = 1;
    }

    public Racional(int a, int b) {
        this.a = a;
        this.b = b;
        if (b == 0) {
            this.b = 1;
        }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
        if (b == 0) {
            this.b = 1;
        }
    }

    public void imprimirConsola() {
        System.out.println("Número racional " + a + "/" + b);
    }

    @Override
    public String toString() {
        return a + "/" + b;
    }

    private int sumar(int a, int b, int c, int d) {
        a = this.a;
        b = this.b;
        int resultado = 0;
        if (b == d) {
            resultado = (a + c) / b;
        } else {
            resultado = ((a * d) + (b * c)) / (b * d);
        }
        return resultado;
    }
}
