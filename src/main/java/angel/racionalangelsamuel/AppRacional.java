/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angel.racionalangelsamuel;

import java.text.DecimalFormat;

/**
 *
 * @author Samuel
 */
public class AppRacional {

    public static void main(String[] args) {
        // Crearemos un objeto Racional z con sus valores
        Racional z = new Racional(4, 5);
        // Crearemos un objeto Racional z con sus valores
        Racional k = new Racional(3, 4);
        // Crearemos un objeto para guardar los datos aleatorios que crearemos
        Racional alea = new Racional();
        // Crearemos un objeto llamado divi para guardar la división a realizar
        Racional divi = new Racional();
        
        
        // Guardaremos en alea un número Racional aleatorio
        alea = Racional.aleatorio();
        // Mostraremos por pantalla el objeto alea
        System.out.println("Aleatorio = " + alea);
        // Mostraremos por pantalla el boolean que nos indicará si z y k son 
        // iguales o no con un true o false
        System.out.println(Racional.igualdad(z, k));
        // En divi se guardará la división de z y k
        divi = Racional.division(z, k);
        // Sacaremos por pantalla el valor de divi
        System.out.println("División = " + divi);
        // Se sumará los números racionales z y k
        z.sumar(k);
        // Mostraremos por pantalla el resultado de la suma
        System.out.println("Suma = " + z);
        
        // Racional z
        System.out.printf("Racional z es %.2f", z.getA());
        System.out.printf("/%.2f" , z.getB());
        System.out.println("");
        // Racional k
        System.out.printf("Racional k es %.2f", k.getA());
        System.out.printf("/%.2f" , k.getB());
        System.out.println("");
        
        // Racional alea
        System.out.printf("Racional alea es %.2f", alea.getA());
        System.out.printf("/%.2f" , alea.getB());
    }
}
