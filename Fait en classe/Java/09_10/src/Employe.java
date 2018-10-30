public class Employe extends Travailleur {
    private double taux;

    public Employe(String nom, String prenom, double salaire, String entreprise, double taux) {
        super(nom, prenom, salaire, entreprise);
        this.setTaux(taux);
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    protected double calculSalaire(){
        return super.getSalaire() * taux;
    }

    public Object clone(){
        return new Employe(getNom(), getPrenom(), getSalaire(), getEntreprise(), getTaux());
    }
}
