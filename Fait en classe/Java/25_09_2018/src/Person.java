import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person implements Cloneable {
    private String name;
    private Calendar dateOfBirth;
    private int numberOfChildren;
    public int[] date;

    public static int numberOfPersons;

    public Person(String name){
        this(name, new GregorianCalendar(1995, 11, 12));
    }
    public Person(String name, Calendar dateOfBirth){
        this(name, dateOfBirth, 0);
    }
    public Person(Calendar dateOfBirth){
        this("Inconnu", dateOfBirth, 0);
    }
    public Person(String name, Calendar dateOfBirth, int numberOfChildren){
        this.setName(name);
        this.setDateOfBirth(dateOfBirth);
        this.setNumberOfChildren(numberOfChildren);

        numberOfPersons++;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(null == name || "" == name)
            return;
        this.name = name;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    private void setDateOfBirth(Calendar dateOfBirth) {
        if (Calendar.getInstance().compareTo(dateOfBirth) < 0)
            return;
        this.dateOfBirth = dateOfBirth;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        if(0 > numberOfChildren)
            return;
        this.numberOfChildren = numberOfChildren;
    }

    public String toString(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        return "Nombre de personnes : " + numberOfPersons
                + "Nom : " + getName()
                + ", date de naissance : " + simpleDateFormat.format(getDateOfBirth().getTime())
                + ", nombre d'enfants : " + getNumberOfChildren();
    }
    public Object clone(){
        return new Person(getName());
    }
}
