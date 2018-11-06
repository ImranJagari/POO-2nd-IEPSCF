public class BouteilleException extends Exception {

    public ErrorCodeEnum errorCode;
    public BouteilleException(ErrorCodeEnum errorCode) {
        this.errorCode = errorCode;
    }

    public String toString(){
        String message = "";

        if(ErrorCodeEnum.CHANGEMENT_DE_CONTENU == errorCode)
            message = "Vous ne pouvez pas changer de contenu tant qu'elle contient quelque chose.";
        if(ErrorCodeEnum.OBLIGATOIRE_ALCOOL == errorCode)
            message = "Vous ne pouvez pas mettre autre chose que de l'alcool.";
        if(ErrorCodeEnum.OVERFLOW_BOUTEILLE == errorCode)
            message = "Bouteille pleine !";
        return message;
    }
}
