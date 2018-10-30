import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Personne> travailleurs = new ArrayList<>();

        travailleurs.add(new Ouvrier("Marthus", "Patrick", 0.5, "IEPSCF", (byte)1));
        travailleurs.add(new Employe("Servais", "Dominique", 500000, "IEPSCF", 25));

        for (Personne personne:travailleurs) {
            System.out.println(personne);
        }
    }
}
