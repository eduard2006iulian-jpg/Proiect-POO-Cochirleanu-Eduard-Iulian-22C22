public class Main { // Declară clasa principală Main, punctul de intrare în aplicație
    public static void main(String[] args) { // Declară metoda main, care este executată prima când pornește programul
        Sportiv[] lotSportivi = new Sportiv[2]; // Creează un vector (tablou) de tip Sportiv cu 2 elemente (pentru a demonstra polimorfismul)

        lotSportivi[0] = new Gimnast("Andrei Popescu", 21, "CS Dinamo", "Inele", 6.4); // Creează un obiect Gimnast și îl pune pe prima poziție (index 0) din vector
        lotSportivi[1] = new Voleibalist("Mihai Ionescu", 24, "Arcada Galați", "Extremă", 345); // Creează un obiect Voleibalist și îl pune pe a doua poziție (index 1) din vector

        System.out.println("=== PREZENTARE LOT SPORTIVI ===\n"); // Afișează un titlu în consolă urmat de un rând liber (\n)

        for (Sportiv s : lotSportivi) { // Parcurge fiecare obiect s din vectorul lotSportivi folosind o buclă for-each
            s.afiseazaProfil(); // Apelează metoda afiseazaProfil() moștenită din clasa părinte Sportiv
            s.executaAntrenament(); // Apelează metoda executaAntrenament() specifică tipului real al obiectului (Gimnast sau Voleibalist)
            s.participaLaCompetitie(); // Apelează metoda participaLaCompetitie() specifică tipului real al obiectului
            System.out.println("--------------------------------------------------"); // Afișează o linie separatoare între sportivi în consolă
        } // Închide bucla for-each
    } // Închide metoda main
} // Închide clasa Main