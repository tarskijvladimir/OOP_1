import java.util.ArrayList;

// Колдун. Своё свойство - мана и магия
public class Magic extends Pers {
    int magia;
    String magic;
    boolean flag;
    public Magic(String name, int x, int y) {
        super(name, 150, "magicStick", 20, 2, 10, 50, 40, new Position(x,y));
        magia = 200;
        magic = "wizardDust";
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

        if (flag && magia == 10) {
                deadlist.sort((o1, o2) -> o2.speed - o1.speed);
                deadlist.get(0).health = maxHealth;
                magia = 0;
                System.out.println("Воскресил: " + deadlist.get(0).name);
                flag = false;
                return;
        }
        if (flag) {
            magia++;
            return;
        }
        if (magia < 2) {
                magia++;
                return;
            }
            sortlist.get(0).health += 10;
            magia -= 2;


    }

    public String getInfo(){
        return "Волшебник";
    };
}
    

