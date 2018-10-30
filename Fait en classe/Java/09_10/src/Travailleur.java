public abstract class Travailleur extends Personne {
    private double salaire;
    private String entreprise;

    public Travailleur(String nom, String prenom, double salaire, String entreprise) {
        super(nom, prenom);
        this.setSalaire(salaire);
        this.setEntreprise(entreprise);
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

    protected abstract double calculSalaire();

    public String toString(){
        return String.format("Travailleur : %s %s, salaire : %f, entreprise : %s", getNom(), getPrenom(), calculSalaire(), getEntreprise());
    }
}
