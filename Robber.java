import java.util.ArrayList;

// Разбойник. Своё свойство - воровство(крадет здоровье)
public class Robber extends Pers {
    int theft;
    public Robber(String name, int x, int y) {
        super(name, 150, "blade", 30, 6, 15, 50, 80, new Position(x,y));
        theft = 10;
    }



    @Override
    public void step(ArrayList<Pers> enemy, ArrayList<Pers> friend) {
        if (health<=0) return;

        Pers target = super.nearestEnemy(enemy);
        if (position.distance(target.position) < 2){
            target.getHit(this.powerHit);
            return;
        }
        Position diff = position.getDifference(target.position);

        Position newposition = new Position(position.x, position.y);

        if (Math.abs(diff.x) > Math.abs(diff.y))

            newposition.x += diff.x < 0 ? 1 : -1;
        else
            newposition.y += diff.y < 0 ? 1 : -1;

        for (Pers pers : friend) {
            if (pers.position.equals(newposition) && pers.health > 0) return;

        }
        this.position = newposition;

    }

    public String getInfo(){
        return "Разбойник";
    };
}


