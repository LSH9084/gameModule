package Practice.game;

import java.util.Random;

import lombok.NoArgsConstructor;

public class MonsterRan {
	public static Monster createMonster() {
		Random rdm = new Random();
		int diceKind = 5;
        int monsterKind = rdm.nextInt(diceKind) + 1;

        switch (monsterKind) {
            case 1:
                return new Monster("Kobold", 100, "Dangger", 4, 10, 8, 1);
            case 2:
                return new Monster("Ork", 150, "Stick", 6, 14, 7, 2);
            case 3:
                return new Monster("Ork leader", 200, "Mace", 8, 15, 9, 3);
            case 4:
                return new Monster("Ogre", 300, "Stick", 6, 18, 10, 4);
            case 5:
                return new Monster("Fallen knight", 200, "Bastard Sword", 8, 18, 12, 5);
            default:
                return null;
        }
    }
}
