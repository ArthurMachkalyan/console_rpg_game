package rpg_game1.units;

import rpg_game1.Game;
import rpg_game1.items.Armor;
import rpg_game1.items.Weapon;

public class Unit {
    Game game;
    String name;
    int level;

    int hp;

    int hpMax;
    Weapon weapon;
    Armor armor;
    public boolean isAlive() {
        return this.hp > 0;
    }

    public int getHpMax() {
        return hpMax;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public Unit(Game game, String name, int hpMax, Weapon weapon, Armor armor) {
        this.game = game;
        this.level = 1;
        this.name = name;
        this.hpMax = hpMax;
        this.hp = this.hpMax;
        this.weapon = weapon;
        this.armor = armor;
    }

    public void attack(Unit target) {
        int actualDamage = target.takeDamage(weapon.getDamage());
        System.out.printf("%s take damage %s %d amount\n", name, target.name, actualDamage);
        target.info();


    }

    public void rest() {
        heal(2);
    }

    public void heal(int amount) {
        if (hp + amount > hpMax)amount = hpMax - hp;
        hp += amount;
        System.out.printf("%s restore %d amount health\n", name, amount);
    }

    public void info() {
        System.out.printf("Name: %s(%d) Health: %d/%d Weapon: %s Armor: %s\n",
                name, level, hp, hpMax, weapon.weaponInfo(), armor.armorInfo());
    }

    public void startTurn() {
        System.out.println();
        info();
    }
    public void skipTurn() {
        System.out.printf("%s missed a move\n", name);
    }

    public int takeDamage(int amount) {
        amount -= armor.getDefence();
        if (amount < 0) amount = 0;
        hp -= amount;
        return amount;
    }


}
