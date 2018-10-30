public class Bouteille implements Cloneable{
    private int contenance;
    private String contenu;


    public Bouteille(int contenance, String contenu) {
        setContenance(contenance);
        setContenu(contenu);
    }

    public int getContenance() {
        return contenance;
    }

    protected void setContenance(int contenance) {
        this.contenance = contenance;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
    public Object clone(){
        return new Bouteille(getContenance(), getContenu());
    }
}
