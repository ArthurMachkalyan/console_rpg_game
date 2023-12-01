package rpg_game1;

import rpg_game1.Game;
import rpg_game1.items.Armor;
import rpg_game1.items.Weapon;
import rpg_game1.units.Monster;
import rpg_game1.units.Unit;

public class AIPlayer {
    private Game game;
    private Monster monster;

    public Monster getMonster() {
        return monster;
    }

    public AIPlayer(Game game) {
        this.game = game;
        this.monster = new Monster(game,1,"Zombie", 6,
                new Weapon("Spear", 1,5),new Armor("Sleeves",1));
    }

    private final String[] MONSTER_NAMES_ARRAY = {"Ork", "Zombie", "Axe"};
    private final String[] WEAPONS_TITLES_ARRAY = {"ShotGun", "Stick", "Pistol", "Bow"};

    public void makeTurn() {
        System.out.println("Monster's move!");
        monster.startTurn();
        int monsterAction = (int) ((Math.random() * 3) + 1);
        switch (monsterAction) {
            case 1:
                monster.attack(game.getPlayer().getHero());
                break;
            case 2:
                monster.skipTurn();
                break;
            case 3:
                monster.rest();
                break;
        }
    }

    public void checkTeam(int heroLevel) {
        if (!monster.isAlive()) {
            int targetLevel = heroLevel + (int) (Math.random() * 3);
            int minWeaponDamage = (int)(heroLevel + Math.random() * 3);
            int maxWeaponDamage = (int)(minWeaponDamage + Math.random() * 6);
            monster = new Monster(game, targetLevel,
                    MONSTER_NAMES_ARRAY[(int) (Math.random() * MONSTER_NAMES_ARRAY.length)],
                    4 + (int)(Math.random() * 8 + heroLevel),
                    new Weapon(WEAPONS_TITLES_ARRAY[(int) (Math.random() * WEAPONS_TITLES_ARRAY.length)],
                            minWeaponDamage, maxWeaponDamage), new Armor("Sleeves", 1));
            System.out.println("Spawn a new monster!!! " + monster.getName());
        }
    }
}
