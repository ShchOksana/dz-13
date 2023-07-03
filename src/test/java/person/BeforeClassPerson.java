package person;

import com.rd.person.Man;
import com.rd.person.Woman;

public abstract class BeforeClassPerson {
    protected Man men1, men2, men3, men4, men5;
    protected Woman women1, women2, women3, women4, women5;

    public void createPersons() {
        men1 = new Man("Ivan", "Ivanov", 33);
        men2 = new Man("Oleh", "Poliakov", 65);
        men3 = new Man("Andrii", "Petrov", 60);
        men4 = new Man("Oleksandr", "Levchenko", 19);
        men5 = new Man("David", "Derevko", 64);
        women1 = new Woman("Anna", "Petrova", 25);
        women2 = new Woman("Olha", "Kovalenko", 60);
        women3 = new Woman("Nataliia", "Kravchenko", 61);
        women4 = new Woman("Olena", "Petrenko", 18);
        women5 = new Woman("Maria", "Koroliuk", 59);
    }
}
