public class blueray extends Medium{
    boolean IstDreid;


    public blueray(String titel, int fsk, int leange, boolean IstDreid){
        super(titel, fsk, leange);
        setIstDreid(IstDreid);
    }


    public void setIstDreid(boolean istDreid) {
        IstDreid = istDreid;
    }
    public boolean getIstDreid(){
        return IstDreid;
    }
        
        
        
            
        
    }