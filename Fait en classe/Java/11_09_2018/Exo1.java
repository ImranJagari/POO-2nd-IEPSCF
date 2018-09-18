public class Exo1 {

    public static void main(String[] args) {
        System.out.println("Hello world !");

        int nombre1 = 100;
        float nombre2 = 200.5f;

        int nombreAdditioné = addition(nombre1, (int)nombre2);
        System.out.println("Les nombres additionés est de :" + nombreAdditioné);

        String prenom = "Dominique";
        String nom = "Servais";

        System.out.println(prenom + " " + nom);


    }
    public static int addition(int nbr1, int nbr2){
        return nbr1 + nbr2;
    }
}
