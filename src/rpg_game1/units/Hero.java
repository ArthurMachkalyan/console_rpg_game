package rpg_game1.units;

import rpg_game1.Game;
import rpg_game1.items.Armor;
import rpg_game1.items.Weapon;
import rpg_game1.utilities.Inventory;
import rpg_game1.utilities.RewardCalculator;

import java.util.Collections;

public class Hero extends Unit {
    private Inventory inventory;
    private int exp = 0;
    private int[] expTo = {0, 1000, 2000, 4000, 8000, 12000, 15000, 1000000};

    public Hero(Game game, String name, int hpMax, Weapon weapon,
                Armor armor, Inventory inventory) {
        super(game, name, hpMax, weapon, armor);
        this.inventory = inventory;
    }

    public void addExp(int amount) {
        exp += amount;
        while (exp >= expTo[level]){
            exp -= expTo[level];
            levelUp();
        }
    }

    public void levelUp() {
        level++;
        System.out.printf("%s leveled up to %d\n", name, level);
        hpMax += (level * 2 + 1);
        hp = hpMax;
    }

    @Override
    public void attack(Unit target) {
        super.attack(target);
        if (!target.isAlive()) {
            int expReward = RewardCalculator.generateExp(this.level, target.getLevel(), target.getHpMax());
            int goldReward = RewardCalculator.generateGold(target.getHpMax());
            System.out.printf(
                    "Hero defeated the monster and received award:" +
                            " %d exp, %d gold\n", expReward, goldReward);
            addExp(expReward);
            inventory.addGold(goldReward);
            inventory.addItems(Collections.emptyList());
        }
    }

    public Inventory getInventory() {
        return inventory;
    }
}
