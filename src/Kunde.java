public class Kunde {
    String vorname;
    String nachname;
    int alter;
    int kundennummer;
    
    public Kunde(String vorname, String nachname, int alter, int kundennummer){
        setAlter(alter);
        setKundennummer(kundennummer);
        setNachname(nachname);
       setVorname(vorname);
    }


    public void setAlter(int alter) {
        this.alter = alter;
    }
    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public int getAlter() {
        return alter;
    }
    public int getKundennummer() {
        return kundennummer;
    }
    public String getNachname() {
        return nachname;
    }
    public String getVorname() {
        return vorname;
    }
    
}

