/*
проонализировать персонажей
длч каждого определить 8 полей данных(сила,здоровье), 3-4 поля поведения (методов атаковать, вылечить...)
создать абстрактный класс и иерархию наследников
 */
/*
Крестьянин:
- здоровье
- сила
- ловкость
- выносливость
- вид оружия
- уровень
- ID
- имя

Разбойник:
- ID
- имя
- здоровье
- сила
- ловкость
- выносливость
- вид оружия

Снайпер:
- ID
- имя
- здоровье
- сила
- ловкость
- выносливость
- вид оружия
- меткость
- маскировка

Колдун:
- ID
- имя
- здоровье
- интеллект
- выносливость
- вид оружия
- мана

Копейщик:
- ID
- имя
- здоровье
- сила
- выносливость
- вид оружия
- защита

Арбалетчик:
- ID
- имя
- здоровье
- выносливость
- вид оружия
- меткость
- количество стрел
- скорость стрельбы

Монах:
- ID
- имя
- здоровье
- выносливость
- интеллект
- вид оружия
- вера
- чакра
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Sniper sniper = new Sniper(null, 0, 0);
        Crossbowman crossbowman = new Crossbowman(null, 0, 0);
        Magic magic = new Magic(null, 0, 0);
        Monk monk = new Monk(null, 0, 0);
        Peasant peasant = new Peasant(null, 0, 0);
        Robber robber = new Robber(null, 0, 0);
        Spearman spearman = new Spearman(null, 0, 0);

        System.out.printf("Name: %s %s\n", sniper.name, sniper.toString());
        System.out.printf("Name: %s %s\n", crossbowman.name, crossbowman.toString());
        System.out.printf("Name: %s %s\n", magic.name, magic.toString());
        System.out.printf("Name: %s %s\n", monk.name, monk.toString());
        System.out.printf("Name: %s %s\n", peasant.name, peasant.toString());
        System.out.printf("Name: %s %s\n", robber.name, robber.toString());
        System.out.printf("Name: %s %s\n", spearman.name, spearman.toString());

        int teamCount = 10;
        
        ArrayList<Pers> team1 = new ArrayList<>();
        ArrayList<Pers> team2 = new ArrayList<>();

        for (int i = 0; i < teamCount; i++){
            switch (new Random().nextInt(2)) {
                case 0:
                    team1.add(new Sniper(getName(), i, 0));
                    break;
            
                case 1:
                    team1.add(new Robber(getName(), i,  0));
                    break;
            }
            switch (new Random().nextInt(2)) {
                case 0:
                    team2.add(new Sniper(getName(), i, 9));
                    break;
            
                case 1:
                    team2.add(new Robber(getName(), i, 9));
                    break;
            }
		// вывести имя и координаты
          	for (int I = 0; I < 10;  i++){
			System.out.println();
		}         

            // Random rand = new Random();   //  1
            // int val = rand.nextInt(7);   // 2
            // int r = rand.nextInt(10);
            // switch (val) {
            //     case 0:
            //         teams.add(new Monk(getName());
            //         break;
            //     case 2:
            //         teams.add(new Crossbowman(getName(), i, val));
            
            //     default:
            //         break;
            // }

        }
        
    }
    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
}
}

