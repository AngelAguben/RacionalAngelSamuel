/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angel.racionalangelsamuel;

import java.util.Random;

/**
 *
 * @author angel
 */
public class Racional {

    private double a, b;

    public Racional() {
        this.a = 1;
        this.b = 1;
    }

    public Racional(double a, double b) {
        this.a = a;
        this.b = b;
        // Si b es 0 se convertirá a 1
        if (b == 0) {
            this.b = 1;
        }
    }

    // Añade los getter y setters
    public double getA() {
        return a;
    }

    public double getB() {
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

    // Método para imprimir por consola
    public void imprimirConsola() {
        System.out.println("Número racional " + a + "/" + b);
    }

    // Método de suma
    public void sumar(Racional x) {

        // Si b es igual a d (los denominadores iguales)
        if (this.b == x.b) {
            this.a += x.a;
        } else { // Si no son iguales hará lo siguiente
            this.a = (this.a * x.b) + (this.b * x.a);
            this.b = b * x.b;
        }
    }

    // Método de resta
    public void restar(Racional x) {

        // Si b es igual a d (los denominadores iguales)
        if (this.b == x.b) {
            this.a -= x.a;
        } else { // Si no son iguales hará lo siguiente
            this.a = this.a * x.b - this.b * x.a;
            this.b = b * x.b;
        }
    }

    public void producto(Racional x) {
        // Esté método multiplicará

        this.a *= x.a;
        this.b = b * x.b;

    }

    public static Racional division(Racional x, Racional y) {
        // Esté método dividirá
        Racional divi = new Racional();

        divi.a = x.a * y.b;
        divi.b = x.b * y.a;
        return divi;
    }

    public static boolean igualdad(Racional x, Racional y) {
        boolean igual = false;
        double numerador = 0, denominador = 0;

        numerador = x.a * y.b;
        denominador = x.b * y.a;
        if (numerador == denominador) {
            igual = true;
        }
        return igual;
    }

//    public static Racional aleatorio() {
//        // Esté método dará un racional aleatorio
//        Racional alea = new Racional();
//        // Creamos un random
//        Random random = new Random();
//
//        alea.a = random.nextInt();
//        alea.b = random.nextInt();
//        if (alea.b == 0) {
//            alea.b = random.nextInt();
//        }
//
//        return alea;
//    }
    public static double aleatorio() {
        // Esté método dará un racional aleatorio
        double numeroAleatorio;
        // Creamos un random
        Random random = new Random();

        numeroAleatorio = random.nextInt();
        if(numeroAleatorio<=0){
            numeroAleatorio = random.nextInt();
        }

        return numeroAleatorio;
    }
}
