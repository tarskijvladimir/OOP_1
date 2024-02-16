// Арбалетчик

public class Crossbowman extends Pers{
    int amountOfbowns;
    int accuracy;
    public Crossbowman(int id, String name, int health, int stamina, String weapon, int amountOfbowns, int accuracy) {
        super(id, name, health, stamina, weapon);
        this.amountOfbowns = amountOfbowns;
        this.accuracy = accuracy;
    }
    
}
