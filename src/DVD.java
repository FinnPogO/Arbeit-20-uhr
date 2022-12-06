public class DVD extends Medium {
    boolean IstFullhd;


    public DVD(String titel, int fsk, int leange, boolean IstFullhd){
        super(titel, fsk, leange);
        setIstFullhd(IstFullhd);
    }

    public void setIstFullhd(boolean istFullhd) {
        IstFullhd = istFullhd;
    }
    public boolean IstFullhd() {
        return IstFullhd;
    }
}
