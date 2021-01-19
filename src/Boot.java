public class Boot extends Fahrzeug {

    private String name;

    public Boot(String name){
        this.name = name;
    }

    public void accelerate(int i){

    }

    /**
     * @param percent anzahl Prozent, auf welche das Boot beschleunigt.
     */
    @Override
    void accerlerate(int percent) {
        System.out.println(this.name+": Beschleunige auf : " +percent+" %");
    }

    /**
     *
     * @param direction richting, in welche das Boot neu steuert.
     */
    public void setDirection(int direction){
        System.out.println(this.name+": Setze Richtung auf : "+direction);

    }
}
