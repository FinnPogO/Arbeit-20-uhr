public class CD extends Medium{
    boolean IstLp;
    boolean IstSp;
    
    public CD(String titel, int fsk, int leange, boolean IstLp, boolean IstSp){
        super(titel, fsk, leange);
        setIstLp(IstLp);
        setIstSp(IstSp);
    }
        
        
    

    public void setIstLp(boolean istLp) {
        IstLp = istLp;
    }
    public void setIstSp(boolean istSp) {
        IstSp = istSp;
    }
    public boolean getIstLp(boolean istLp){
        return istLp;
    }
    public boolean getIstSp(boolean istSp){
        return istSp;
    }

}
