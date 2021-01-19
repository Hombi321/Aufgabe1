public abstract class Fahrzeug {
    public Fahrzeug(){

    }

    /**
     *
     * @param percent anzahl Prozent, auf welche das Boot beschleunigt
     */
    abstract void accerlerate(int percent);

    /**
     *
     * @param direction Richtung, in welche das Boot neu steuert.
     */
    abstract void setDirection(int direction);
}
