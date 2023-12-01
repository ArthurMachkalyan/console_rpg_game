package rpg_game.monsters;

import javax.swing.*;

public class StackMonsters {
    private MonsterClass[] monsters;

    public StackMonsters(MonsterClass... monster) {
        monsters = new MonsterClass[monster.length];
        for (int i = 0; i < monsters.length; i++) {
            monsters[i] = monster[i];
        }
    }

    public MonsterClass[] getMonsters() {
        return monsters;
    }
}
