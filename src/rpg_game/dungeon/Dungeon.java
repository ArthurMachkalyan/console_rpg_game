package rpg_game.dungeon;

import rpg_game.Party;
import rpg_game.monsters.MonsterClass;

public class Dungeon implements BasicDungeon{
    private boolean isOpened = true;
    private MonsterClass[] monsters;
    @Override
    public boolean open(Party party) {
        if (party.getPartyMembers().length < 3) {
            System.out.println("Not enough party members!");
            isOpened = false;
        }
        else {
            System.out.println("Welcome heroes! \nGet ready for the adventure");
        }
        return isOpened;
    }

}
