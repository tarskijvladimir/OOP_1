public class Monk extends Pers {
    int faith;
    int chakra;
    public Monk(int id, String name, int health, int stamina, String weapon, int faith, int chakra) {
        super(id, name, health, stamina, weapon);
        this.faith = faith;
        this.chakra = chakra;
    }
    
}
