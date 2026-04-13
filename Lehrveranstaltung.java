import java.util.ArrayList;

public class Lehrveranstaltung {
    private String titel;
    private Dozierender dozierender;
    private ArrayList<Studierender> studierende;
    private ArrayList<Vorlesungsstunde> vorlesungsstunden;
    private ArrayList<Praktikumsstunde> praktikumsstunden;

    public Lehrveranstaltung(String titel, Dozierender dozierender) {
        this.titel = titel;
        this.dozierender = dozierender;
        this.studierende = new ArrayList<Studierender>();
        this.vorlesungsstunden = new ArrayList<Vorlesungsstunde>();
        this.praktikumsstunden = new ArrayList<Praktikumsstunde>();
    }

    public String getTitel() {
        return this.titel;
    }

    public void studierendenHinzufuegen(Studierender studierender) {
        this.studierende.add(studierender);
        System.out.println(studierender.getName() + " wurde zur Lehrveranstaltung " + this.titel + " hinzugefügt.");
    }

    public void studierendenEntfernen(Studierender studierender) {
        if (this.studierende.remove(studierender)) {
            System.out.println(studierender.getName() + " wurde aus der Lehrveranstaltung " + this.titel + " entfernt.");
        } else {
            System.out.println(studierender.getName() + " ist nicht in der Lehrveranstaltung " + this.titel + " eingetragen.");
        }
    }

    public void vorlesungsstundeHinzufuegen(Vorlesungsstunde stunde) {
        this.vorlesungsstunden.add(stunde);
        System.out.println("Vorlesungsstunde \"" + stunde.getThema() + "\" wurde hinzugefügt.");
    }

    public void praktikumsstundeHinzufuegen(Praktikumsstunde stunde) {
        this.praktikumsstunden.add(stunde);
        System.out.println("Praktikumsstunde \"" + stunde.getThema() + "\" wurde hinzugefügt.");
    }

    public void veranstaltungsdetailsAnzeigen() {
        System.out.println("");
        System.out.println("Lehrveranstaltung: " + this.titel);
        System.out.println("Dozierender: " + this.dozierender.getName());
        System.out.println("Teilnehmerzahl: " + this.studierende.size());

        System.out.println("\nTeilnehmende Studierende:");
        if (this.studierende.isEmpty()) {
            System.out.println("Keine Studierenden eingetragen.");
        } else {
            for (Studierender s : this.studierende) {
                System.out.println("- " + s.getName() + " (" + s.getMatrikelnummer() + ")");
            }
        }

        System.out.println("\nVorlesungsstunden:");
        if (this.vorlesungsstunden.isEmpty()) {
            System.out.println("Keine Vorlesungsstunden vorhanden.");
        } else {
            for (Vorlesungsstunde v : this.vorlesungsstunden) {
                v.detailsAnzeigen();
                System.out.println();
            }
        }

        System.out.println("Praktikumsstunden:");
        if (this.praktikumsstunden.isEmpty()) {
            System.out.println("Keine Praktikumsstunden vorhanden.");
        } else {
            for (Praktikumsstunde p : this.praktikumsstunden) {
                p.detailsAnzeigen();
                System.out.println();
            }
        }
        System.out.println("");
    }
}