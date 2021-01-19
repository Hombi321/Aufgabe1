public class Motorboot extends Boot{

    private int horsePower;
    /**
     *
     * @param name Name des Bootes, welche an die Superklasse weitergereicht wird. (Boot)
     */
    public Motorboot(String name){
        super(name);

    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
