import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class Pers implements MyInterface{
    String name;
    int health;
    String weapon;
    int powerHit;
    int speed;
    int bronya;
    int atackRange;
    int hidding;
    int maxHealth;
    int x;
    int y;

    String className;
    public Position position;
    ArrayList deadList;

    public Pers(String name, int health, String weapon, int powerHit, int speed, int bronya, int atackRange, int hidding, Position position){
        this.className = this.getClass().getSimpleName();
        this.name = name;
        this.maxHealth = this.health = health;
        this.weapon = weapon;
        this.powerHit = powerHit;
        this.speed = speed;
        this.bronya = bronya;
        this.atackRange = atackRange;
        this.hidding = hidding;
        this.position = position;


    }



    // Метод вывода информации о персонаже
    @Override
    public String toString() {
        return  name + ", \u2665: " + health + ",  ⚔ : " + powerHit + ", \uD83D\uDEE1\uFE0F :" + bronya;
    }

    // Метод вывода короткой информации о персонаже
    public void printShort() {
        System.out.println(className + ", Name: " + name +", P: " + position.getX() + "," + position.getY() + ".");
    }

    // Метод нанесения урона
    public void getHit(float damage) {
        health -= damage;
        if (health < 0) health = 0;
        if (health > maxHealth) health = maxHealth;

    }

    // Метод лечения
    public void Heall(Monk monk, Pers pers1) {
        pers1.health = pers1.health + monk.healing;

    }

    // Метод получения урона
    public void Damag(Pers pers1, Pers pers2) {
        pers1.health = pers1.health - pers2.powerHit;

    }

    // Метод колдовства
    public void Magical(Magic magic, Pers pers1) {
        pers1.health = pers1.health - magic.magia;

    }

    public Pers nearestEnemy(List<Pers> targets) {
        if (targets.isEmpty()) {
            return null; // Handle empty list case
        }

        Pers nearest = null;
        double minDistance = Double.MAX_VALUE;

        for (Pers hero : targets) {
            double distance = position.distance(hero.position);
            if (distance < minDistance && hero.health > 0) {
                minDistance = distance;
                nearest = hero;
            }
        }

        return nearest;
    }


    public int getSpeed() {
        return speed;
    }

    public int getHp(){
        return health;
    };

    public String getInfo(){
        return " ";
    };
}