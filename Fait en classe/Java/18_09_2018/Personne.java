public class Personne {

    public static int nombreDePersonnes = 0;

    private String nom;
    private int age;

    public Personne(){
        nombreDePersonnes++;
    }
    public Personne(String nom, int age){
        this.setAge(age);
        this.setNom(nom);

        nombreDePersonnes++;
    }

    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
