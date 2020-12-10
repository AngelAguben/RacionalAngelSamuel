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
        // Si b es 0 se convertirá a 1
        if (b == 0) {
            this.b = 1;
        }
    }

    // Añade los getter y setters
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
        // Si b es 0 se convertirá a 1
        if (b == 0) {
            this.b = 1;
        }
    }

    // Añade el método toString
    @Override
    public String toString() {
        return a + "/" + b;
    }

    // Método de suma
    public void sumar(Racional x) {

        // Si b es igual a d (los denominadores iguales)
        if (this.b == x.b) {
            this.a += x.a;
        } else { // Si no son iguales hará lo siguiente
            this.a=this.a*x.b+this.b*x.a;
            this.b=b*x.b;
        }
    }

    // Método para imprimir por consola
    public void imprimirConsola() {
        System.out.println("Número racional " + a + "/" + b);
    }

    // Método de resta
    private int restar(int a, int b, int c, int d) {
        a = this.a;
        b = this.b;
        int resultado = 0;
        if (b == d) {
            resultado = (a - c) / b;
        } else {
            resultado = ((a * d) - (b * c)) / (b * d);
        }
        return resultado;
    }
}