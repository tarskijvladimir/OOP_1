import java.util.ArrayList;

// Копейщик. Своё свойство - количество копей
public class Spearman extends Pers {
    int countSpear;
    public Spearman(String name, int x, int y) {
        super(name, 150, "spear", 30, 6, 15, 50, 40, new Position(x,y));
        countSpear = 0;
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
        if (Math.abs(diff.x) > Math.abs(diff.y)){
            this.position.x += diff.x < 0? 1: -1;
        } else {
            this.position.y += diff.y < 0? 1: -1;
        }


    }

    public String getInfo(){
        return "Копейщик";
    };
}
