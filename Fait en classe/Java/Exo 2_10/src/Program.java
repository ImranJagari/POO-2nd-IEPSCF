import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        BouteilleColoree bouteilleColoree = new BouteilleColoree(100, "Vin", "Violette");


        bouteilleColoree.setContenu("Eau");
        bouteilleColoree.setCouleur("Bleu");

        ArrayList<Bouteille> bouteilles = new ArrayList<>();

        bouteilles.add(new BouteilleColoree(100, "Vin", "Rouge"));
        bouteilles.add(new Bouteille(200, "Eau"));
        bouteilles.add(new BouteilleColoree(500, "Coca", "Noir"));


        for (Bouteille bouteille: bouteilles) {
            bouteille.clone();
        }

    }
}
