public class Character {

    private String name;
    private int health;
    private int strength;

    public Character(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void hit(Character character){

        if(this == character)
            return;

        character.updateHealth(-this.getStrength());
    }
    public void heal(Character character){
        character.updateHealth(this.getStrength());
    }

    private void updateHealth(int points){
        health += points;
    }
}
