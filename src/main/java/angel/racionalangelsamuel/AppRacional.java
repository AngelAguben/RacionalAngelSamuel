/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angel.racionalangelsamuel;

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
        // Crearemos un objeto llamado divi para guardar la división a realizar
        Racional divi = new Racional();

        // Mostraremos por pantalla un número Racional aleatorio
        System.out.println(Racional.aleatorio());
        // Mostraremos por pantalla el boolean que nos indicará si z y k son 
        // iguales o no con un true o false
        System.out.println(Racional.igualdad(z, k));
        // En divi se guardará la división de z y k
        divi = Racional.division(z, k);
        // Sacaremos por pantalla el valor de divi
        System.out.println(divi);
        // Se sumará los números racionales z y k
        z.sumar(k);
        // Mostraremos por pantalla el resultado de la suma
        System.out.println(z);
    }
}
