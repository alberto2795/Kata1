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
public class Person {

    private final String name;
    private final String surname;
    private final Calendar birth;
    private long MILLISECOND_PER_YEAR = (long) (1000 * 60 * 60 * 24 * 365.25);

    public Person(String name, String surname, Calendar birth) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
    }

    public Calendar getBirth() {
        return birth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public int getAge() {
        Calendar today = GregorianCalendar.getInstance();
        return (int) milliseconds(today.getTimeInMillis() - birth.getTimeInMillis());
    }

    private long milliseconds(long millis) {
        return millis / MILLISECOND_PER_YEAR;
    }
}
