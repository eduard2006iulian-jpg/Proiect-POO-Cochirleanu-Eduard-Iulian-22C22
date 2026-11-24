public class Main {
    public static void main(String[] args) {

        Gimnast g1 = new Gimnast("Andrei Popescu", 21, "CS Dinamo", 170.5, 65.0,
                "Inele", 6.4, 8, "Senior", true);
        /*
         * EXPLICATIE SECVENTA (Test constructor cu toate argumentele):
         * Creeaza obiectul g1 completand toate cele 10 campuri direct din constructor.
         */

        Gimnast g2 = new Gimnast(g1);
        g2.setNume("Vlad Marin");
        g2.setAparatPreferat("Paralele");
        /*
         * EXPLICATIE SECVENTA (Test constructor de copiere + metode set):
         * Cloneaza obiectul g1 in g2, apoi ii modifica numele si aparatul folosind metodele set.
         */

        Voleibalist v1 = new Voleibalist();
        v1.setNume("Mihai Ionescu");
        v1.setVarsta(24);
        v1.setClub("Arcada Galați");
        v1.setInaltimeCm(198.0);
        v1.setGreutateKg(90.5);
        v1.setPost("Extremă");
        v1.setInaltimeSarituraCm(345);
        v1.setNumarTricou(7);
        v1.setPunctePeMeci(16.5);
        v1.setEsteCapitan(true);
        /*
         * EXPLICATIE SECVENTA (Test constructor fara argumente + metode set):
         * Creeaza obiectul v1 cu valori implicite si ii populeaza toate cele 10 campuri prin metodele set.
         */

        Sportiv[] lotSportivi = {g1, g2, v1};

        System.out.println("=== PREZENTARE LOT SPORTIVI ===\n");

        for (Sportiv s : lotSportivi) {
            System.out.println(s.toString());
            s.executaAntrenament();
            s.participaLaCompetitie();
            System.out.println("--------------------------------------------------");
        }
        /*
         * EXPLICATIE SECVENTA (Polimorfism, toString si metodele din interfata):
         * Grupeaza toti sportivii intr-un vector de tip Sportiv, afiseaza toate datele cu toString()
         * si apeleaza cele 2 metode din interfata pentru fiecare obiect in parte.
         */
    }
}