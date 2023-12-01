package rpg_game1;

import rpg_game1.Game;
import rpg_game1.items.Armor;
import rpg_game1.items.Weapon;
import rpg_game1.units.Hero;
import rpg_game1.units.Unit;
import rpg_game1.utilities.Inventory;

public class Player {
    private Game game;
    private Hero hero;

    public Unit getHero() {
        return hero;
    }

    public Player(Game game) {
        this.game = game;
        this.hero = new Hero(game, "Freeman", 10,
                new Weapon("Stick", 1,4),
                new Armor("Helmet",2), new Inventory());
    }

    public void makeTurn() {
        System.out.println("Player's move");
        hero.startTurn();
         // TODO Подумать как использовать вещи из рюкзака
            int heroAction = game.getInputSystem().select
                    ("Choose an action: \n1. Attack \n2. Relax \n3. " +
                            "Skip a turn \n4.View backpack ", 1, 4);
            switch (heroAction) {
                case 1:
                    hero.attack(game.getAiPlayer().getMonster()) ;
                    break;
                case 2:
                    hero.rest();
                    break;
                case 3:
                    hero.skipTurn();
                    break;
                case 4:
                    hero.getInventory().printInfo();
                    break;
            }

    }

}
