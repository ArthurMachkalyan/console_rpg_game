package rpg_game1;

public class Game {
    private Player player;
    private AIPlayer aiPlayer;

    public Player getPlayer() {
        return player;
    }

    public AIPlayer getAiPlayer() {
        return aiPlayer;
    }

    public InputSystem getInputSystem() {
        return inputSystem;
    }

    private InputSystem inputSystem;

    public void init() {
        inputSystem = new InputSystem();
        player = new Player(this);
        aiPlayer = new AIPlayer(this);

    }

    public void start() {
        System.out.println("Start Game!");
        player.getHero().info();
        aiPlayer.getMonster().info();
        while (true) {
            player.makeTurn();
            aiPlayer.checkTeam(player.getHero().getLevel());
            if (isGameEnd())break;
            aiPlayer.makeTurn();
            if (isGameEnd())break;
        }
    }

    public boolean isGameEnd() {
        if (!aiPlayer.getMonster().isAlive() && !player.getHero().isAlive()) {System.out.println("Nobody's won!"); return true;}
        if (!aiPlayer.getMonster().isAlive()) {System.out.println("Hero's won! End game! ");return true;}
        if (!player.getHero().isAlive()) {System.out.println("Monster's won! End game! "); return true;}
        return false;
    }

}
