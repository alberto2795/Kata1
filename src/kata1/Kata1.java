/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

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
        Calendar f1;
        f1 = GregorianCalendar.getInstance();
        f1.set(1995, 07, 27);
        Person p1 = new Person("Hector", "Ruiz", f1);
        System.out.println(p1.getFullName());
        System.out.println("");
        System.out.println(p1.getBirth().getTime());
        System.out.println(p1.getAge());
        System.out.println("");
        System.out.println("Bien");
    }
}
