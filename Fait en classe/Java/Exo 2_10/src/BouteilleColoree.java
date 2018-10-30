public class BouteilleColoree extends Bouteille {

    private String couleur;

    public BouteilleColoree(int contenance, String contenu, String couleur) {
        super(contenance, contenu);
        this.setCouleur(couleur);
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    protected void setContenance(int contenance){
        super.setContenance(contenance + 10);
    }

    public Object clone(){
        return new BouteilleColoree(getContenance(), getContenu(), getCouleur());
    }
}
