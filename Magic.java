// Колдун (Sorcerer)

public class Magic extends Pers {
    int intellect;
    int mana;
    public Magic(int id, String name, int health, int stamina, String weapon, int intellect, int mana) {
        super(id, name, health, stamina, weapon);
        this.intellect = intellect;
        this.mana = mana;
    }
    
}
