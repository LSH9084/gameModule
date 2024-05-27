package Practice.game;

import java.util.Random;
import java.util.Scanner;

public class MonsterEncount {
	Random rdm = new Random();
	public static void playerGame(Player player,Random rdm) {
		 	
		Scanner sc = new Scanner(System.in);
        boolean tour = true;
        int diceEncounter = 8;
        int diceKind = 5;

        while (tour) {
            System.out.printf(
                player.getName() + " 님은 모험의 여행을 떠났습니다. \n" + "1 을 선택하시면, 계속 앞으로 나아갑니다." + "2 를 선택하시면, 휴식을 취합니다.");
            int tourFlag = sc.nextInt();
            if (tourFlag == 1) {
                System.out.println("----------------------------------------------------------");
                System.out.println(player.getName() + " 님 기척이 느껴집니다. (주사위를 굴립니다.)");
                int monsterEncounter = rdm.nextInt(diceEncounter);
                System.out.println(monsterEncounter + "  나왔습니다.");
                if (monsterEncounter > 4) {
                    System.out.println("-----------------------------------------------------");
                    System.out.println("아무 것도 없습니다. 계속 여행을 떠납니다.");
                } else {
                	MonsterRan mo = new MonsterRan();
                    Monster monster = mo.createMonster();
                    System.out.println("-----------------------------------------------------");
					System.out.printf("몬스터가 있는 것 같습니다. \n" 
									+ "주사위를 굴립니다. \n");
                    System.out.println("-----------------------------------------------------");
                    System.out.println(monster.getWeaponName() + " 으로 무장한  " + monster.getName() + "입니다.");
                    System.out.println("hp:"+monster.getHp());
                    System.out.println("str:"+monster.getStr());
                    System.out.println("attack:"+monster.getWeaponDice());
                    System.out.println("dex:"+monster.getDex());
                    System.out.println("level:"+monster.getLevel());
                }
            } else if (tourFlag == 2) {
                System.out.printf(
                        "--------------------------------------------- \n" + 
                        "잠을 잡니다.  zzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
            }
        }
    }

}
