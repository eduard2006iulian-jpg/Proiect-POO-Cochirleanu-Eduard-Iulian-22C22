public class Voleibalist extends Sportiv { // Declară clasa derivată Voleibalist, care moștenește clasa părinte Sportiv
    private String post; // Declară un atribut privat specific voleibalistului: postul pe care joacă
    private int inaltimeSarituraCm; // Declară un atribut privat specific voleibalistului: înălțimea săriturii în centimetri

    public Voleibalist(String nume, int varsta, String club, String post, int inaltimeSarituraCm) { // Declară constructorul clasei Voleibalist cu atributele moștenite și cele proprii
        super(nume, varsta, club); // Apelează constructorul clasei părinte Sportiv pentru a inițializa nume, varsta și club
        this.post = post; // Inițializează atributul post al obiectului curent
        this.inaltimeSarituraCm = inaltimeSarituraCm; // Inițializează atributul inaltimeSarituraCm al obiectului curent
    } // Închide constructorul clasei Voleibalist

    @Override // Adnotare care indică faptul că suprascriem o metodă din interfață/clasa părinte
    public void executaAntrenament() { // Implementează metoda executaAntrenament specifică unui voleibalist
        System.out.println(nume + " (Voleibalist - " + post + ") face antrenament de blocaj și atac cu o săritură de " + inaltimeSarituraCm + " cm."); // Afișează în consolă detalii despre antrenamentul voleibalistului
    } // Închide metoda executaAntrenament

    @Override // Adnotare care indică faptul că suprascriem o metodă din interfață/clasa părinte
    public void participaLaCompetitie() { // Implementează metoda participaLaCompetitie specifică unui voleibalist
        System.out.println(nume + " joacă titular pe postul de " + post + " în meciul oficial al clubului " + club + "."); // Afișează în consolă mesajul de participare la competiție al voleibalistului
    } // Închide metoda participaLaCompetitie
} // Închide clasa Voleibalist