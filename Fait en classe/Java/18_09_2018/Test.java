public class Test {
    public static void main(String[] args) {
        Character c1 = new Character("Pat", 1000, 50);
        Character c2 = new Character("Dom", 1000, 100);

        System.out.println("Le joueur " + c1.getName()+" a "+c1.getStrength()+"points en force et " + c1.getHealth() +" points en vie !");
        System.out.println("Le joueur " + c2.getName()+" a "+c2.getStrength()+"points en force et " + c2.getHealth() +" points en vie !");

        c1.hit(c2);
        System.out.println("Le joueur " + c1.getName()+" a "+c1.getStrength()+"points en force et " + c1.getHealth() +" points en vie !");
        System.out.println("Le joueur " + c2.getName()+" a "+c2.getStrength()+"points en force et " + c2.getHealth() +" points en vie !");

        c2.heal(c2);
        System.out.println("Le joueur " + c1.getName()+" a "+c1.getStrength()+"points en force et " + c1.getHealth() +" points en vie !");
        System.out.println("Le joueur " + c2.getName()+" a "+c2.getStrength()+"points en force et " + c2.getHealth() +" points en vie !");

        c2.hit(c1);
        System.out.println("Le joueur " + c1.getName()+" a "+c1.getStrength()+"points en force et " + c1.getHealth() +" points en vie !");
        System.out.println("Le joueur " + c2.getName()+" a "+c2.getStrength()+"points en force et " + c2.getHealth() +" points en vie !");

    }
}
