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
        Racional z = new Racional(4, 5);
        Racional k = new Racional(3, 4);
        Racional aleatorio = new Racional(Racional.aleatorio(), Racional.aleatorio());

        System.out.println(aleatorio);
        System.out.println(Racional.igualdad(z, k));
        System.out.println(Racional.division(z, k));
        z.sumar(k);
        System.out.println(z);

    }
}
