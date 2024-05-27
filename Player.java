package Practice.game;

import lombok.Getter;

@Getter
public class Player {
    private String name;
    private int job;
    private int level;
    private int hp;
    private String weaponName;
    private int weaponDice;
    private int str;
    private int dex;

    public Player(String name, int job, String weaponName, int weaponDice, int hp, int str, int dex) {
        this.name = name;
        this.job = job;
        this.level = 10;
        this.weaponName = weaponName;
        this.weaponDice = weaponDice;
        this.hp = hp;
        this.str = str;
        this.dex = dex;
    }

    public void newStats (int diceSum) {
        if (diceSum >= 15) {
            // No adjustment
        } else if (diceSum >= 8) {
            hp -= (hp * 10) / 100;
            str -= (str * 10) / 100;
            dex -= (dex * 10) / 100;
        } else {
            hp -= (hp * 20) / 100;
            str -= (str * 20) / 100;
            dex -= (dex * 20) / 100;
        }
    }
    
    
}
