import java.util.ArrayList;

// Монах. Своё свойство - лечение
public class Monk extends Pers {
    int healing;
    public Monk(String name, int x, int y) {
        super(name, 150, "null", 0, 4, 10, 50, 40, new Position(x,y));
        healing = 0;
    }




    @Override
    public void step(ArrayList<Pers> enemy, ArrayList<Pers> friend) {

    }

    public String getInfo(){
        return "Монах";
    };
}

