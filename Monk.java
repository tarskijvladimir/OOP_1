import java.util.ArrayList;
import java.util.*;

// Монах. Своё свойство - лечение
public class Monk extends Pers {
    int healing;
    int mana;
    boolean flag;
    public Monk(String name, int x, int y) {
        super(name, 150, "null", 0, 4, 10, 50, 40, new Position(x,y));
        healing = 0;
        mana = 10;
        flag = false;
    }


    @Override
    public void step(ArrayList<Pers> enemy, ArrayList<Pers> friend) {
        if (getHp() <= 0) return;
        ArrayList<Pers> sortlist = new ArrayList<>(friend);
        ArrayList<Pers> deadlist = new ArrayList<>();
        sortlist.sort((o1, o2) -> o1.getHp() - o2.getHp());
        int countdaed = 0;
        for (Pers pers : sortlist) {
            if (pers.getHp() == 0) {
                deadlist.add(pers);
                countdaed++;
            }
        }
        if (deadlist.size() > 3 ) {
            flag = true;
            System.out.println("Флаг установлен");
        }

        if (flag && mana == 10) {
                deadlist.sort((o1, o2) -> o2.speed - o1.speed);
                deadlist.get(0).health = maxHealth;
                mana = 0;
                System.out.println("Воскресил: " + deadlist.get(0).name);
                flag = false;
                return;
        }
        if (flag) {
            mana++;
            return;
        }
        if (mana < 2) {
                mana++;
                return;
            }
            sortlist.get(0).health += 10;
            mana -= 2;
        }
    public String getInfo(){
        return "Монах";
    }
    @Override
    public String toString() {
        return super.toString() + ", Мана : " + mana;
    }
    }