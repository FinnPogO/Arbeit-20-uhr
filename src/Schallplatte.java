public class Schallplatte extends Medium {
    boolean kannverliehenwerden;


    public Schallplatte(String titel, int fsk, int leange, boolean kannverliehenwerden){
        super(titel, fsk, leange);
        setKannverliehenwerden(kannverliehenwerden);
    }

    public void setKannverliehenwerden(boolean kannverliehenwerden) {
        this.kannverliehenwerden = kannverliehenwerden;
    }
    public boolean getKannverliehenwerden(boolean kannverliehenwerden) {
        return kannverliehenwerden;
    }
}