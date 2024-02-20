// лучник

public class Archer extends Pers {
    int accuracy;
    int disguise;

    public Archer(String name, int x, int y) {
        super(8, name, 50, 60, 80, x, y);
        // this.accuracy = accuracy;
        // this.disguise = disguise;

    private Position position;
    
    public Archer(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
            this.position = position;

    
    }

    

}


