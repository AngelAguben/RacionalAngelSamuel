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
        Racional r1 = new Racional(2, 5);
        Racional r2 = new Racional(4, 10);

        System.out.println(Racional.division(r1, r2));

        System.out.println(Racional.igualdad(r1, r2));

        System.out.println(Racional.aleatorio());

    }
}
