package rpg_game.classes.characters;

import rpg_game.classes.CharacterClass;

public class Archer extends CharacterClass {
    public Archer(String name) {
        this.setLevel(1);
        this.setMaxHealthPoints(75);
        this.setMaxManaPoints(30);
        this.setHealthPoints(75);
        this.setManaPoints(30);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL_RANGED);
        this.setAttackAmount(7);
    }
}
