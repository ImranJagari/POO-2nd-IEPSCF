import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try {

            Bouteille b1 = new Bouteille(6000, "Houppe");

        }catch(BouteilleException e){
            System.out.println(e);
        }
    }
}

