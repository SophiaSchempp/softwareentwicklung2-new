public class Vorlesungsstunde {
    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;

    public Vorlesungsstunde(String thema, String datum, String uhrzeit, String raum) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
    }

    public String getThema() {
        return this.thema;
    }

    public void detailsAnzeigen() {
        System.out.println("Vorlesungsstunde:");
        System.out.println("Thema: " + this.thema);
        System.out.println("Datum: " + this.datum);
        System.out.println("Uhrzeit: " + this.uhrzeit);
        System.out.println("Raum: " + this.raum);
    }
}