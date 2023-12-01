package rpg_game.classes;

import rpg_game.BaseClass;
import rpg_game.classes.characters.AttackType;

public abstract class CharacterClass implements BaseClass {
    private int healthPoints;
    private int manaPoints;
    private int level;
    private AttackType attackType;
    private int attackAmount;
    private String name;
    private int maxHealthPoints;
    private int maxManaPoints;


    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        if (healthPoints < 0 ) this.healthPoints = 0;
        else if (healthPoints > this.maxHealthPoints) this.healthPoints = maxHealthPoints;
        else this.healthPoints = healthPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        if (manaPoints < 0) this.manaPoints = 0;
        else if (manaPoints > maxManaPoints) this.manaPoints = maxManaPoints;
        else this.manaPoints = manaPoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 0) System.out.println("We can't lose level!");
        this.level = level;
    }

    public int getAttackAmount() {
        return attackAmount;
    }

    public void setAttackAmount(int attackAmount) {
        if (attackAmount < 0) System.out.println("We can't have attack rate below zero!");
        else this.attackAmount = attackAmount;
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

    @Override
    public void attack() {

    }

    @Override
    public void restoreHealth(int amount) {
        setHealthPoints(this.healthPoints + amount);
    }

    @Override
    public void loseHealth(int amount) {
        setHealthPoints(this.healthPoints - amount);
    }

    @Override
    public void restoreMana(int amount) {
        setManaPoints(this.manaPoints + amount);
    }

    @Override
    public void loseMana(int amount) {
        setManaPoints(this.manaPoints - amount);
    }

    @Override
    public void levelUp() {

    }

    @Override
    public void info() {
        System.out.println("Name: " + this.name + "\nCurrent HP: "
        + this.getHealthPoints() + "\nCurrent Mana: " + this.getManaPoints()
        + "\nCurrent LVL: " + this.getLevel());
    }
}
