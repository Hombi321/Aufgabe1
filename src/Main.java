import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector <Fahrzeug> fahrzeuge = new Vector<Fahrzeug>();

        fahrzeuge.addElement(new SegelBoot("Amore"));
        fahrzeuge.addElement(new SegelBoot("Windy"));
        fahrzeuge.addElement(new Motorboot("Arrow"));


    int accels[] = {40, -23, 77};
    int dirs[] = {-20, 3, 23};

    for(int i = 0; i<fahrzeuge.size(); i++){
        fahrzeuge.get(i).accerlerate(accels[i]);
        fahrzeuge.get(i).setDirection(dirs[i]);
        }
}
}