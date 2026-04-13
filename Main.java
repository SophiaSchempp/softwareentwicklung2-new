public class Main {
    public static void main(String[] args) {
        Studierender a = new Studierender("Tom", 101, "IT");
        Studierender a2 = new Studierender("Tom2", 101, "IT");
        Dozierender b = new Dozierender("asdf", "IT", 0);
        a.frageStellen(b, "hallo");
        a.sendeSprechstundenanfrage(b, "Fragen zur Abgabe", "Mittwoch 14:00");
        System.out.println();
        b.zeigeFeedback();
        System.out.println();

        b.feedbackErhalten(a, "Die Vorlesung war sehr verständlich.");
        System.out.println();
        b.zeigeFeedback();
        System.out.println();
        Lehrveranstaltung lv = new Lehrveranstaltung("Softwareentwicklung 2", b);

        b.studentHinzufuegen(lv, a);
        b.studentHinzufuegen(lv, a2);

        Vorlesungsstunde v1 = new Vorlesungsstunde(
                "Einführung in Git",
                "15.04.2026",
                "08:15",
                "Hörsaal A");

        Praktikumsstunde p1 = new Praktikumsstunde(
                "GitHub und Branching",
                "16.04.2026",
                "10:00",
                "Labor 2",
                "Repository anlegen, Branch erstellen, Pull Request durchführen");

        lv.vorlesungsstundeHinzufuegen(v1);
        lv.praktikumsstundeHinzufuegen(p1);

        System.out.println();
        lv.veranstaltungsdetailsAnzeigen();

        lv.studierendenEntfernen(a2);
        System.out.println();
        lv.veranstaltungsdetailsAnzeigen();

    }
}
