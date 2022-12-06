public class Medium {
    String titel;
    int fsk;
    int leange;



    public Medium(String titel, int fsk, int leange){
        setFsk(fsk);
        setLeange(leange);
        setTitel(titel);
    }


    public void setFsk(int fsk) {
        this.fsk = fsk;
    }
    public void setLeange(int leange) {
        this.leange = leange;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }
    public int getFsk() {
        return fsk;
    }
    public int getLeange() {
        return leange;
    }
    public String getTitel() {
        return titel;
    }
    
}
