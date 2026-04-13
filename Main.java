public class Main {
    public static void main(String[] args) {
        Studierender a = new Studierender("Tom",101,"IT");
        Dozierender b = new Dozierender("asdf", "IT", 0);
        a.frageStellen(b, "hallo");
        a.sendeSprechstundenanfrage(b, "Fragen zur Abgabe", "Mittwoch 14:00");

         b.feedbackErhalten(a, "Die Vorlesung war sehr verständlich.");
        System.out.println();
        b.zeigeFeedback();
        System.out.println();
    }
}
