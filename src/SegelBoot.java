public class SegelBoot extends Boot {
    private int numberOfSails;

    /**
     *
     * @param name Name des Bootes, welche an die Superklasse weitergereicht wird. (Boot)
     */
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
