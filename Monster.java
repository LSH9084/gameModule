package Practice.game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Monster {
    private String name; 
    private int hp; 
    private String weaponName; 
    private int weaponDice;
    private int str;
    private int dex;
    private int level;

//    public Monster(String d, int f, String g, int h, int str, int dex, int level) {
//        this.name = d;
//        this.hp = f;
//        this.weaponName = g;
//        this.weaponDice = h;
//        this.str = str;
//        this.dex = dex;
//        this.level = level;
//    }
}