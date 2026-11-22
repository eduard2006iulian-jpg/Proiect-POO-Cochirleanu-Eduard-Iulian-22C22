public class Gimnast extends Sportiv { // Declară clasa derivată Gimnast, care moștenește clasa părinte Sportiv
    private String aparatPreferat; // Declară un atribut privat specific gimnastului: aparatul preferat
    private double scorDificultate; // Declară un atribut privat specific gimnastului: scorul de dificultate (număr cu zecimale)

    public Gimnast(String nume, int varsta, String club, String aparatPreferat, double scorDificultate) { // Declară constructorul clasei Gimnast cu atributele moștenite și cele proprii
        super(nume, varsta, club); // Apelează constructorul clasei părinte Sportiv pentru a inițializa nume, varsta și club
        this.aparatPreferat = aparatPreferat; // Inițializează atributul aparatPreferat al obiectului curent
        this.scorDificultate = scorDificultate; // Inițializează atributul scorDificultate al obiectului curent
    } // Închide constructorul clasei Gimnast

    @Override // Adnotare care indică faptul că suprascriem o metodă din interfață/clasa părinte
    public void executaAntrenament() { // Implementează metoda executaAntrenament specifică unui gimnast
        System.out.println(nume + " (Gimnast) exersează elementele de dificultate " + scorDificultate + " la " + aparatPreferat + "."); // Afișează în consolă detalii despre antrenamentul gimnastului
    } // Închide metoda executaAntrenament

    @Override // Adnotare care indică faptul că suprascriem o metodă din interfață/clasa părinte
    public void participaLaCompetitie() { // Implementează metoda participaLaCompetitie specifică unui gimnast
        System.out.println(nume + " intră în concurs la proba de " + aparatPreferat + " și vizează podiumul."); // Afișează în consolă mesajul de participare la competiție al gimnastului
    } // Închide metoda participaLaCompetitie
} // Închide clasa Gimnast