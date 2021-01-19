public class Boot extends Fahrzeug {

    private String name;

    public Boot(String name){
        this.name = name;
    }

    public void accelerate(int i){

    }

    @Override
    void accerlerate(int percent) {
        System.out.println(this.name+": Beschleunige auf : " +percent+" %");
    }

    public void setDirection(int direction){
        System.out.println(this.name+": Setze Richtung auf : "+direction);

    }
}
