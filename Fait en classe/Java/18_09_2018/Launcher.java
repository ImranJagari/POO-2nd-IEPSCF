public class Launcher {
    public static void main(String[] args) {

        System.out.println(Personne.nombreDePersonnes);

        Personne p1 = new Personne("Dominique", 42);

        System.out.println(Personne.nombreDePersonnes);

        System.out.println(p1.getNom());
        System.out.println("l'âge est de : " + p1.getAge());

        Personne p2 = new Personne("Patrick", 99);

        System.out.println(Personne.nombreDePersonnes);

    }
}
