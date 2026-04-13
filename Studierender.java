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

    public void frageStellen(Dozierender dozent, String frage){
    System.out.println("Frage an "+dozent.getName()+ ": "+ frage);
    }

    public Studierender(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }
    
}
