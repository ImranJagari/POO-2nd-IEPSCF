public class Bouteille {

    public final int maxContenanceBouteille = 5000;

    public int contenance;
    public String contenu;

    public Bouteille(int contenance, String contenu) throws BouteilleException {
        this.setContenu(contenu);
        this.setContenance(contenance);
    }

    public Bouteille() throws BouteilleException {
        this(100, "Eau");
    }

    public int getContenance() {
        return contenance;
    }

    private void setContenance(int contenance) throws BouteilleException {
        if(contenance > maxContenanceBouteille)
            throw new BouteilleException(ErrorCodeEnum.OVERFLOW_BOUTEILLE);
        this.contenance = contenance;
    }

    public void ajouterContenance(int value) throws BouteilleException {
            if (getContenance() + value > maxContenanceBouteille)
                throw new BouteilleException(ErrorCodeEnum.OVERFLOW_BOUTEILLE);
            setContenance(getContenance() + value);
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) throws BouteilleException {

        if("Eau" == contenu)
            throw new BouteilleException(ErrorCodeEnum.OBLIGATOIRE_ALCOOL);
        if(getContenu() != contenu && getContenance() > 0)
            throw new BouteilleException(ErrorCodeEnum.CHANGEMENT_DE_CONTENU);

        this.contenu = contenu;
    }
}
