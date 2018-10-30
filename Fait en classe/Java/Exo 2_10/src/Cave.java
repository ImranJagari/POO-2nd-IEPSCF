import java.util.ArrayList;

public class Cave implements Cloneable {
    private ArrayList<Bouteille> bouteillesStockees;

    public Cave(ArrayList<Bouteille> bouteillesStockees) {
        setBouteillesStockees(bouteillesStockees);
    }

    public ArrayList<Bouteille> getBouteillesStockees() {
        return bouteillesStockees;
    }

    private void setBouteillesStockees(ArrayList<Bouteille> bouteillesStockees) {
        this.bouteillesStockees = bouteillesStockees;
    }
    public void ajouterBouteille(Bouteille bouteille){
        bouteillesStockees.add(bouteille);
    }
    public void retirerBouteille(Bouteille bouteille){

        bouteillesStockees.remove(bouteille);

    }
    public void ajouterBouteilles(ArrayList<Bouteille> bouteilles){
        this.bouteillesStockees.addAll(bouteilles);
    }

    //methode pour transferer les bouteilles d'une cave à une autre

    public void transferer(Cave cave) {
        cave.ajouterBouteilles(bouteillesStockees);
        this.bouteillesStockees.clear();
    }

    public Object clone(){
        Cave tempCave = new Cave(new ArrayList<>());
        for(Bouteille bouteille : bouteillesStockees){
            tempCave.ajouterBouteille((Bouteille)bouteille.clone());
        }
        return tempCave;
    }
}
