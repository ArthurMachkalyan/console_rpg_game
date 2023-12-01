package rpg_game1.items;

public class Armor implements Item {
    private String title;
    private int defence;

    public Armor(String title, int defence) {
        this.title = title;
        this.defence = defence;

    }

    public int getDefence() {
        return defence;
    }

    public String armorInfo() {
        return String.format("%s [%d]", title, defence);
    }

    @Override
    public String getItemName() {
        return title;
    }
}
