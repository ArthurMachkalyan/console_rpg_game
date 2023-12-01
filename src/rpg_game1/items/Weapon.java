package rpg_game1.items;

public class Weapon implements Item {
    private String title;
    private int minDamage;
    private int maxDamage;

    public Weapon(String title, int minAttack, int maxAttack) {
        this.title = title;
        this.minDamage = minAttack;
        this.maxDamage = maxAttack;
    }

    public int getDamage() {
        return  minDamage + (int) (Math.random() * (maxDamage - minDamage + 1));
    }

    public String weaponInfo() {
        return String.format("%s [%d/%d]", title, minDamage, maxDamage);
    }

    @Override
    public String getItemName() {
        return title;
    }
}
