package rpg_game.classes.characters;

import rpg_game.classes.CharacterClass;

public class Warrior extends CharacterClass {
    public Warrior(String name) {
        this.setLevel(1);
        this.setMaxHealthPoints(100);
        this.setMaxManaPoints(50);
        this.setHealthPoints(100);
        this.setManaPoints(50);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL);
        this.setAttackAmount(5);
    }
}
