// Крестьянин

public class Peasant extends Pers {
    int strength;
    int agility;

    public Peasant(String name, int x, int y) {
        super(4, name, 50, 80, 5, x, y);
        // this.strength = strength;
        // this.agility = agility;
     
    }
    @Override
    public void attack(Pers target){
        int damage = Pers.r.nextInt(1.5) * strength * agility;
        target.GetDamage(damage);
    }
    public void work(int hour){
        stamina -= hour / 4;
    }
    
}
