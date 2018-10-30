public class Ouvrier extends Travailleur {

    private byte anciennete;

    public Ouvrier(String nom, String prenom, double salaire, String entreprise, byte anciennete) {
        super(nom, prenom, salaire, entreprise);
        this.anciennete = anciennete;
    }

    public byte getAnciennete() {
        return anciennete;
    }

    public void setAnciennete(byte anciennete) {
        this.anciennete = anciennete;
    }

    protected double calculSalaire(){
        return (super.getSalaire() + super.getSalaire() * (anciennete/10));
    }
    public String toString(){
        return String.format("Ouvrier : %s %s, salaire : %f, anciennete : %d, entreprise : %s", getNom(), getPrenom(), calculSalaire(), getAnciennete(), getEntreprise());
    }

}
