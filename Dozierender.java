import java.util.ArrayList;

public class Dozierender {
    private String name;
    private ArrayList<String> sprechstundenanfragen;
    private ArrayList<String> feedbackListe;


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
        this.sprechstundenanfragen = new ArrayList<String>();
        this.feedbackListe= new ArrayList<String>();
    }

    public int getBueronummer() {
        return bueronummer;
    }

    public void frageBeantworten(Studierender studi, String antwort) {
        System.out.println("Antwort an " + studi.getName() + ": " + antwort);
    }

     public void empfangeSprechstundenanfrage(Studierender studierender, String anliegen, String terminwunsch) {
        String eintrag = "Anfrage von " + studierender.getName()
                + " | Anliegen: " + anliegen
                + " | Terminwunsch: " + terminwunsch;
        this.sprechstundenanfragen.add(eintrag);
        System.out.println(this.name + " hat eine neue Sprechstundenanfrage erhalten.");
    }

     public void feedbackErhalten(Studierender studierender, String feedback) {
        String eintrag = "Feedback von " + studierender.getName() + ": " + feedback;
        this.feedbackListe.add(eintrag);
        System.out.println(this.name + " hat Feedback erhalten.");
    }
    public void zeigeFeedback() {
        System.out.println("Feedback für " + this.name + ":");
        if (this.feedbackListe.isEmpty()) {
            System.out.println("Kein Feedback vorhanden.");
        } else {
            for (String eintrag : this.feedbackListe) {
                System.out.println(eintrag);
            }
        }
    }
    public void studentHinzufuegen(Lehrveranstaltung lv, Studierender s) {
    lv.studierendenHinzufuegen(s);
}
}