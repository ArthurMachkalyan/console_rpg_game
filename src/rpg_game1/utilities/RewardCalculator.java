package rpg_game1.utilities;

public class RewardCalculator {
    public static int generateExp(int heroLevel, int monsterLevel, int monsterHp) {
        int amount = monsterHp * 100;
        amount = (int) (amount * (1.0f + (monsterLevel - heroLevel) * 0.25f));
        if (amount < 0) amount = 0;
        return amount;
    }

    public static int generateGold(int monsterHp) {
        return monsterHp * 5;

    }
}
