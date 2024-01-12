package rpg_game;

import rpg_game.classes.characters.Archer;
import rpg_game.classes.characters.Healer;
import rpg_game.classes.characters.Mage;
import rpg_game.classes.characters.Warrior;
import rpg_game.dungeon.Dungeon;
import rpg_game.monsters.Necromancer;
import rpg_game.monsters.Skeleton;
import rpg_game.monsters.StackMonsters;

public class Main {
    public static void main(String[] args) {
        Party party = new Party(new Mage("Gen"), new Warrior("Axe"),
                new Archer("WindRanger"), new Healer("WitchDoctor"));
        StackMonsters stackMonsters = new StackMonsters(new Skeleton(1),
                new Necromancer(1));
        party.setStackMonsters(stackMonsters);
        party.info();
        Dungeon dungeon = new Dungeon();
        if (party.enterDungeon(dungeon)) {
            party.setDungeon(dungeon);
            party.runDungeon();
        } else {
            System.out.println("Game over!");
        }
        Party party1 = new Party(new Mage("Leo"), new Warrior("kell"), new Archer("Deni"));
        // Hello
    }
}
