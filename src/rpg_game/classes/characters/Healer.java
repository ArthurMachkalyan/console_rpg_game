package rpg_game.classes.characters;

import rpg_game.classes.CharacterClass;

public class Healer extends CharacterClass {
    public Healer(String name) {
        this.setLevel(1);
        this.setMaxHealthPoints(100);
        this.setMaxManaPoints(70);
        this.setHealthPoints(100);
        this.setManaPoints(70);
        this.setName(name);
        this.setAttackType(AttackType.MAGICAL);
        this.setAttackAmount(5);
    }
}
