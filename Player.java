package Practice.game;

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

    public String getName() {
        return name;
    }

    public int getJob() {
        return job;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public int getWeaponDice() {
        return weaponDice;
    }

    public int getStr() {
        return str;
    }

    public int getDex() {
        return dex;
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
