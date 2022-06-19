public class Main{
    public static void main(String[] args) {
        
        String[] players = {"John", "Joey", "Jason"};

        MonopolyGame monopolyGame = new MonopolyGame(players);
        int j = 0;
        
        for(int i = 0; i < players.length; i++){
            
            int diceValue = monopolyGame.playTurn(i);

            System.out.println(monopolyGame.getCurrentPlayerName(i)+" roll "+diceValue+" point");

            if(monopolyGame.getGameWin().getWin() == true){
                j = i;
                break;
            }
            
            if(i == players.length - 1){
                i = -1;
            }
        }

        System.out.println(monopolyGame.getCurrentPlayerName(j)+ " win");
    }
}