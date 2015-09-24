/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Kata1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola");
        Person p1 = new Person("Hector", "Ruiz", new Date(95, 06, 27));
        System.out.println(p1.getFullName());
        System.out.println("");
        System.out.println(p1.getBirth());
        System.out.println(p1.getAge());
        System.out.println("");
        System.out.println("Bien");
    }
}
