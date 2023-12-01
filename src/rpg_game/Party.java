package rpg_game;

import rpg_game.classes.CharacterClass;
import rpg_game.dungeon.Dungeon;
import rpg_game.monsters.StackMonsters;

public class Party {
    private CharacterClass[] partyMembers;
    private Dungeon dungeon;

    private StackMonsters stackMonsters;

    public Dungeon getDungeon() {
        return dungeon;
    }

    public void setDungeon(Dungeon dungeon) {
        this.dungeon = dungeon;
    }

    public void setStackMonsters(StackMonsters stackMonsters) {

    }

    public Party(CharacterClass... members) {
        partyMembers = new CharacterClass[members.length];
        for (int i = 0; i < partyMembers.length; i++) {
            partyMembers[i] = members[i];
        }
    }
    public CharacterClass[] getPartyMembers() {
        return partyMembers;
    }

    public void setPartyMembers(CharacterClass[] partyMembers) {
        this.partyMembers = partyMembers;
    }

    public void info() {
        for (CharacterClass members : partyMembers) {
            members.info();
        }
    }

    public void runDungeon() {
        System.out.println("Ahead " + stackMonsters);

    }

    public boolean enterDungeon(Dungeon dungeon) {
        return dungeon.open(this);
    }
}
