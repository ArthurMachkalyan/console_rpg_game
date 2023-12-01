package rpg_game.monsters;
import rpg_game.BaseClass;
import rpg_game.classes.characters.AttackType;

import java.util.stream.BaseStream;

public class MonsterClass implements BaseClass {
    private int healthPoints;
    private int manaPoints;
    private int level;
    private AttackType attackType;
    private int attackAmount;

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }

    public int getAttackAmount() {
        return attackAmount;
    }

    public void setAttackAmount(int attackAmount) {
        this.attackAmount = attackAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public int getMaxManaPoints() {
        return maxManaPoints;
    }

    public void setMaxManaPoints(int maxManaPoints) {
        this.maxManaPoints = maxManaPoints;
    }

    private String name;
    private int maxHealthPoints;
    private int maxManaPoints;
    @Override
    public void attack() {

    }

    @Override
    public void restoreHealth(int amount) {

    }

    @Override
    public void loseHealth(int amount) {

    }

    @Override
    public void restoreMana(int amount) {

    }

    @Override
    public void loseMana(int amount) {

    }

    @Override
    public void levelUp() {

    }

    @Override
    public void info() {
    }
}
