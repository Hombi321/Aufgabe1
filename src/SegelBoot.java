public class SegelBoot extends Boot {
    private int numberOfSails;

    public SegelBoot(String name){
        super(name);
    }

    public int getNumberOfSails() {
        return numberOfSails;
    }

    public void setNumberOfSails(int numberOfSails) {
        this.numberOfSails = numberOfSails;
    }
}
