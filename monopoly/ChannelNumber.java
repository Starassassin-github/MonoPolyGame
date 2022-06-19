public class ChannelNumber {
    
    private int position;
    private int round;

    public ChannelNumber(){
        position = 0;
        round  = 0;
    }

    public int getPosition(){
        return position;
    }

    public void numPosition(int diceValue){
        this.position += diceValue;

        if(this.position / 40 == 1){
            numRound();
            this.position = 0;
        }
    }

    public int getRound(){
        return round;
    }

    public void numRound(){
        this.round += 1;
    }
}
