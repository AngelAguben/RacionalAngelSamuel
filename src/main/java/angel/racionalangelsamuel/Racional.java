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

    // Hemos cambiado a double para poder limitar la salida a decimales
    private double a, b;
    
    // Constructor por defecto, indicando como numerador y denominador el valor 1.
    public Racional() {
        this.a = 1;
        this.b = 1;
    }

    // Constructor parametrizado. Se debe controlar que el denominador no es 
    // cero, en tal caso se asignará el valor 1
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
        // Devolverá lo siguiente;
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
    
    //Método de multiplicar
    public void producto(Racional x) {
        // Esté método multiplicará lo siguiente
        this.a *= x.a;
        this.b = b * x.b;

    }
    // Método de clase de division
    public static Racional division(Racional x, Racional y) {
        // Crearemos un nuevo objeto racional para la division
        Racional divi = new Racional();
        // Esté método dividirá lo siguiente
        divi.a = x.a * y.b;
        divi.b = x.b * y.a;
        // Dewvolverá el objeto divi
        return divi;
    }

    // Crearemos un método de clase para ver si son iguales o no los dos racionales
    public static boolean igualdad(Racional x, Racional y) {
        // Crearemos un boolean para después utilizalo
        boolean igual = false;
        // Crearemos dos double para comprovar luego si los resultados son iguales
        double numerador = 0, denominador = 0;
        
        numerador = x.a * y.b;
        denominador = x.b * y.a;
        // Si numerador == denominador igual será true, si no, seguirá siendo false
        if (numerador == denominador) {
            igual = true;
        }
        // Devolveremos el booelan
        return igual;
    }

    // Método aleatorio para crear un racional con valores double 
    public static Racional aleatorio() {
        // Esté método dará un racional aleatorio
        // Crearemos un objeto alea para guardar los datos aleatorios
        Racional alea = new Racional();
        // Creamos un random
        Random random = new Random();
        
        // alea.a será igual a la concatenación de un int hasta 100 y un double 
        alea.a = random.nextInt(100) + random.nextDouble();
        do { 
            alea.b = random.nextInt(100) + random.nextDouble();
            // Mientras alea.b sea igual a 0 se ejecutará el bucle
        } while (alea.b == 0); 
        
        // Devolverá el objeto alea
        return alea;
    }
}