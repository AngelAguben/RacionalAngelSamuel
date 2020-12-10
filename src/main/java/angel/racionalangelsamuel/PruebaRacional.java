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
public class PruebaRacional {

    public static void main(String[] args) {
        Racional r1 = new Racional(14, 5);
        Racional r2 = new Racional(18, 5);

        r1.sumar(r2);
        r1.imprimirConsola();

    }
}
