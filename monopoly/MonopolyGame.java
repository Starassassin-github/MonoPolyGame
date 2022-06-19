public class MonopolyGame {
    private Dice[] dice;
    private Player[] players;
    private int boardChannel;
    private Win gameWin;

    public MonopolyGame(String[] playerNames){
        this.players = new Player[playerNames.length];

        for(int i = 0; i < playerNames.length; i++){
            this.players[i] = new Player(playerNames[i]);
        }

        this.dice = new Dice[2];
        this.dice[0] = new Dice();
        this.dice[1] = new Dice();

        this.boardChannel = 40;
        this.gameWin = new Win();
    }

    public int playTurn(int turnNumber){
        Player currentPlayer = this.players[turnNumber];
        int diceValue = currentPlayer.rollDice(this.dice[0], this.dice[1]);

        this.players[turnNumber].setChanelNumber(diceValue);

        this.gameWin.checkWin(this.players[turnNumber]);

        return diceValue;
    }

    public String playerWin(Player player){
        return gameWin.getPlayerWin(player);
    }

    public String getCurrentPlayerName(int turnNumber){
        Player currentPlayer = this.players[turnNumber];
        return currentPlayer.getName();
    }

    public Win getGameWin(){
        return gameWin;
    }
}
