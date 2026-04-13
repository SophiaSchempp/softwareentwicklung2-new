public class Praktikumsstunde {
    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;
    private String aufgaben;

    public Praktikumsstunde(String thema, String datum, String uhrzeit, String raum, String aufgaben) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
        this.aufgaben = aufgaben;
    }

    public String getThema() {
        return this.thema;
    }

    public void detailsAnzeigen() {
        System.out.println("Praktikumsstunde:");
        System.out.println("Thema: " + this.thema);
        System.out.println("Datum: " + this.datum);
        System.out.println("Uhrzeit: " + this.uhrzeit);
        System.out.println("Raum: " + this.raum);
        System.out.println("Aufgaben: " + this.aufgaben);
    }
}