public class Mitarbeiter {
    String vorname;
    String nachname;
    int mitarbeiternummer;

    public Mitarbeiter(String vorname, String nachname, int mitarbeiternummer){
        setMitarbeiternummer(mitarbeiternummer);
        setNachname(nachname);
        setVorname(vorname);
    }

    public void setMitarbeiternummer(int mitarbeiternummer) {
        this.mitarbeiternummer = mitarbeiternummer;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public int getMitarbeiternummer() {
        return mitarbeiternummer;
    }
    public String getNachname() {
        return nachname;
    }
    public String getVorname() {
        return vorname;
    }
}
