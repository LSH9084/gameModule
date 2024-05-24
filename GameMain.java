package Practice.game;

import java.util.Random;
import java.util.Scanner;

public class GameMain {

    public static void main(String[] args) {
        boolean tour = true;
        Random rdm = new Random();
        MonsterEncount pg = new MonsterEncount();
        StatsChoice pg2 = new StatsChoice();
        while (tour) {
            Player player = pg2.createPlayer(rdm);
            pg.playerGame(player, rdm);
        }
    }
}