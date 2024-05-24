package Practice.game;

public class Monster {
    private String name;
    private int hp;
    private String weaponName;
    private int weaponDice;
    private int str;
    private int dex;
    private int level;

    public Monster(String name, int hp, String weaponName, int weaponDice, int str, int dex, int level) {
        this.name = name;
        this.hp = hp;
        this.weaponName = weaponName;
        this.weaponDice = weaponDice;
        this.str = str;
        this.dex = dex;
        this.level = level;
    }

    public String getName() {
        return name;
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

    public int getLevel() {
        return level;
    }
}