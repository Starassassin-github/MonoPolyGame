public class Player {
    
    private String name;
    private ChannelNumber channelNumber;

    public Player(String name){
        this.name = name;
        this.channelNumber = new ChannelNumber();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int rollDice(Dice dice1, Dice dice2){
        dice1.randomNumber();
        dice2.randomNumber();

        int value = dice1.getFaceValue() + dice2.getFaceValue();
        return value;
    }

    public ChannelNumber getChannelNumber(){
        return channelNumber;
    }

    public void setChanelNumber(int diceValue){
        this.channelNumber.numPosition(diceValue);
    }
}
