public class Dozierender {
    private String name;

    public String getName() {
        return name;
    }

    private String fakultaet;

    public String getFakultaet() {
        return fakultaet;
    }

    private int bueronummer;

    public Dozierender(String name, String fakultaet, int bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
    }

    public int getBueronummer() {
        return bueronummer;
    }

    public void frageBeantworten(Studierender studi, String antwort) {
        System.out.println("Antwort an " + studi.getName() + ": " + antwort);
    }
}