public class Studierender {
    private String name;

    public String getName() {
        return name;
    }

    private int matrikelnummer;

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    private String studiengang;

    public String getStudiengang() {
        return studiengang;
    }

    public void frageStellen(Dozierender dozent, String frage) {
        System.out.println("Frage an " + dozent.getName() + ": " + frage);
    }

    public void sendeSprechstundenanfrage(Dozierender dozierender, String anliegen, String terminwunsch) {
        System.out.println(this.name + " sendet eine Sprechstundenanfrage an " + dozierender.getName() + ".");
        System.out.println("Anliegen: " + anliegen);
        System.out.println("Terminwunsch: " + terminwunsch);

        dozierender.empfangeSprechstundenanfrage(this, anliegen, terminwunsch);
    }

    public Studierender(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

}
