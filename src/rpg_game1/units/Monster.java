package rpg_game1.units;

import rpg_game1.Game;
import rpg_game1.items.Armor;
import rpg_game1.items.Weapon;

public class Monster extends Unit {
    public Monster(Game game, int level, String name, int hpMax, Weapon weapon, Armor armor) {
        super(game, name, hpMax, weapon, armor);
        this.level = level;
    }

}
