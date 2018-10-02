import java.util.GregorianCalendar;

public class Program {
    public static void main(String[] args) {
        Person p1 = new Person("Dominique");
        System.out.println(p1.toString());
        Person p2 = new Person(new GregorianCalendar(1200, 10, 10));
        System.out.println(p2.toString());
        Person p3 = new Person("Patrick", new GregorianCalendar(1650, 10, 12));
        System.out.println(p3.toString());
        Person p4 = (Person)p3.clone();
        System.out.println(p4.toString());
    }
}
