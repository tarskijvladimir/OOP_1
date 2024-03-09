import java.util.ArrayList;

// Крестьянин. Своё свойство - количество стрел

public class Peasant extends Pers {
    int countArrow;
    protected boolean flag;
    public Peasant(String name, int x, int y) {
        super(name, 150, "arrow", 0, 4, 10, 0, 40, new Position(x,y));
        countArrow = 0;
        flag = false;
    }
    protected void printname() {
        System.out.println("Name: " + name);
    }



    @Override
    public void step(ArrayList<Pers> enemy, ArrayList<Pers> friend) {
    //     if (health <= 0) return;
    //     flag = false;
    // }
        
    //     if (health <= 0) return;
    //         Pers pers = nearestEnemy(enemy);
    //         if (position.getDistanse(pers) < 2){
    //             attac(pers);
    //             return;
    //         }
    //         // ходит
    //         Position diff = this.position.getDiff(pers.position);
    //         Position currentPos = new Position(position.getX(), position.getY());
    //         if (Math.abs(diff.getX()) > Math.abs(diff.getY())){

    //         }
    // }
        
    
        if (countArrow <= 0) return;
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

        if (flag && countArrow == 10) {
                deadlist.sort((o1, o2) -> o2.speed - o1.speed);
                deadlist.get(0).health = maxHealth;
                countArrow = 0;
                System.out.println("Дал стрел: " + deadlist.get(0).name);
                flag = false;
                return;
        }
        if (flag) {
            countArrow ++;
            return;
        }
        if (countArrow  < 2) {
            countArrow ++;
                return;
            }
            sortlist.get(0).health += 10;
            countArrow  -= 2;
        }



    // private void attac(Pers pers) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'attac'");
    // }
    public int getCountArrow() {
        return countArrow;
    }
    @Override
    public String toString() {
        return super.toString() + ", \u27b6 : " + countArrow;
    }
    public String getInfo(){
        return "Фермер";
    };
}

    

