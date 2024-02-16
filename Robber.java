public class Robber extends Pers{
    int power;
    int agility;
    public Robber(int id, String name, int health, int stamina, String weapon, int power, int agility) {
        super(id, name, health, stamina, weapon);
        this.power = power;
        this.agility = agility;
    }
    
}
