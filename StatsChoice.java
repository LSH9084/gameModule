package Practice.game;

import java.util.Random;
import java.util.Scanner;

public class StatsChoice {
	public static Player createPlayer(Random rdm) {
        Scanner sc = new Scanner(System.in);

        System.out.println("당신의 이름을 입력하세요.");
        String name = sc.nextLine();

        System.out.println("---------------------------------------------");
        System.out.println(name + " 님 직업을 선택해주세요.");
        System.out.println("1. 전사  2. 마법사  3. 사냥꾼");
        int job = sc.nextInt();

        String weaponName = "";
        int weaponDice = 0;
        int hp = 0;
        int str = 0;
        int dex = 0;

        switch (job) {
            case 1: //전사 선택
                hp = 200;
                str = 20;
                dex = 10;
                System.out.println("전사는 다음 무기를 선택할 수 있습니다.");
                System.out.println("1. Sword  2. Bastard Sword");
                int warriorWeapon = sc.nextInt();
                if (warriorWeapon == 1) {
                    weaponName = "Sword";
                    weaponDice = 8;
                } else if (warriorWeapon == 2) {
                    weaponName = "Bastard Sword";
                    weaponDice = 10;
                    dex = dex- 2;
                }
                break;

            case 2: //마법사 선택
                hp = 100;
                str = 8;
                dex = 9;
                System.out.println("마법사는 다음 무기를 선택할 수 있습니다.");
                System.out.println("1. Staff  2. Magic Mace");
                int mageWeapon = sc.nextInt();
                if (mageWeapon == 1) {
                    weaponName = "Staff";
                    weaponDice = 4;
                } else if (mageWeapon == 2) {
                    weaponName = "Magic Mace";
                    weaponDice = 6;
                    dex = dex -1;
                }
                break;

            case 3: //사냥꾼 선택
                hp = 150;
                str = 14;
                dex = 20;
                System.out.println("사냥꾼은 다음 무기를 선택할 수 있습니다.");
                System.out.println("1. Long Bow  2. Bolt");
                int hunterWeapon = sc.nextInt();
                if (hunterWeapon == 1) {
                    weaponName = "Long Bow";
                    weaponDice = 6;
                } else if (hunterWeapon == 2) {
                    weaponName = "Bolt";
                    weaponDice = 8;
                    dex = dex-2;
                }
                break;
        }

        System.out.println("-------------------------------------------------------");
        System.out.printf("* " + weaponName + " * 을/를 선택하셨습니다. 공격 시 " + weaponDice + " 면체 주사위를 굴립니다. \n ");
        System.out.println("-------------------------------------------------------");
        System.out.println("마지막으로 " + name + " 님의 능력치를 정하겠습니다.");
        System.out.println("10면체 주사위 두개를 굴립니다. 두개의 합에 따라 능력이 정해집니다.");
        System.out.println("-------------------------------------------------------");

        int dice10_1 = rdm.nextInt(10) + 1;
        int dice10_2 = rdm.nextInt(10) + 1;
        int diceSum = dice10_1 + dice10_2;

        System.out.println("첫번째 주사위는 " + dice10_1);
        System.out.println("두번째 주사위는 " + dice10_2);

        Player player = new Player(name, job, weaponName, weaponDice, hp, str, dex);
        player.newStats(diceSum);

        System.out.println("-------------------------------------------------------");
        System.out.printf(player.getName() + " 님 당신의 능력치 입니다. \n" + "체력 : " + player.getHp() + " \n" + "힘 : " + player.getStr() + " \n"
                + "민첩 : " + player.getDex() + " \n" + "무기 :" + player.getWeaponName() + " \n"+"레벨 :"+player.getLevel()+"\n");
        System.out.println("-------------------------------------------------------");
        System.out.println(player.getName() + " 님 이대로 진행하시겠습니까? (1. YES  2. NO)");
        System.out.println("-------------------------------------------------------");

        int character_set_flag = sc.nextInt();
        if (character_set_flag == 2) {
            return createPlayer(rdm);
        }
        return player;
    }
}
