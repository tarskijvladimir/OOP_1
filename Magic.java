import java.util.ArrayList;

// Колдун. Своё свойство - мана и магия
public class Magic extends Pers {
    int mana;
    String magic;
    public Magic(String name, int x, int y) {
        super(name, 150, "magicStick", 20, 2, 10, 50, 40, new Position(x,y));
        mana = 200;
        magic = "wizardDust";
    }



    @Override
    public void step(ArrayList<Pers> enemy, ArrayList<Pers> friend) {

    }

    public String getInfo(){
        return "Волшебник";
    };
}
    

