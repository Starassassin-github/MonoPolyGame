public class Win {
    private boolean win;

    public Win(){
        win = false;
    }
    
    public boolean getWin(){
        return win;
    }

    public void checkWin(Player player){
        if(player.getChannelNumber().getRound() == 2){
            this.win = true;
        }
    }

    public String getPlayerWin(Player player) {
        return player.getName();
    }

   
}
