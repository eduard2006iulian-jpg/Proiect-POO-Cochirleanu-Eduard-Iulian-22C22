public class Gimnast extends Sportiv {

    private String aparatPreferat;
    private double scorDificultate;
    private int numarMedalii;
    private String nivelExperienta;
    private boolean esteInLotulNational;
    /*
     * EXPLICATIE SECVENTA (Campuri private):
     * Am adaugat 5 campuri private specifice gimnastului.
     * Impreuna cu cele 5 campuri mostenite din Sportiv, avem 10 campuri in total (Cerinta 2).
     */

    public Gimnast() {
        super();
        this.aparatPreferat = "Sol";
        this.scorDificultate = 0.0;
        this.numarMedalii = 0;
        this.nivelExperienta = "Începător";
        this.esteInLotulNational = false;
    }
    /*
     * EXPLICATIE SECVENTA (Constructor fara argumente):
     * Apeleaza constructorul gol din Sportiv prin super() si seteaza valori implicite pentru campurile proprii.
     */

    public Gimnast(String nume, int varsta, String club, double inaltimeCm, double greutateKg,
                   String aparatPreferat, double scorDificultate, int numarMedalii,
                   String nivelExperienta, boolean esteInLotulNational) {
        super(nume, varsta, club, inaltimeCm, greutateKg);
        this.aparatPreferat = aparatPreferat;
        this.scorDificultate = scorDificultate;
        this.numarMedalii = numarMedalii;
        this.nivelExperienta = nivelExperienta;
        this.esteInLotulNational = esteInLotulNational;
    }
    /*
     * EXPLICATIE SECVENTA (Constructor cu toate argumentele):
     * Trimite primele 5 valori la clasa parinte Sportiv prin super(...) si initializeaza cele 5 campuri proprii.
     */

    public Gimnast(Gimnast altGimnast) {
        super(altGimnast);
        this.aparatPreferat = altGimnast.aparatPreferat;
        this.scorDificultate = altGimnast.scorDificultate;
        this.numarMedalii = altGimnast.numarMedalii;
        this.nivelExperienta = altGimnast.nivelExperienta;
        this.esteInLotulNational = altGimnast.esteInLotulNational;
    }
    /*
     * EXPLICATIE SECVENTA (Constructor de copiere):
     * Copiază partea de Sportiv prin super(altGimnast) si apoi copiaza cele 5 campuri specifice gimnastului.
     */

    public String getAparatPreferat() { return aparatPreferat; }
    public void setAparatPreferat(String aparatPreferat) { this.aparatPreferat = aparatPreferat; }

    public double getScorDificultate() { return scorDificultate; }
    public void setScorDificultate(double scorDificultate) { this.scorDificultate = scorDificultate; }

    public int getNumarMedalii() { return numarMedalii; }
    public void setNumarMedalii(int numarMedalii) { this.numarMedalii = numarMedalii; }

    public String getNivelExperienta() { return nivelExperienta; }
    public void setNivelExperienta(String nivelExperienta) { this.nivelExperienta = nivelExperienta; }

    public boolean isEsteInLotulNational() { return esteInLotulNational; }
    public void setEsteInLotulNational(boolean esteInLotulNational) { this.esteInLotulNational = esteInLotulNational; }
    /*
     * EXPLICATIE SECVENTA (Metode Get si Set):
     * Ofera acces controlat (citire si scriere) pentru cele 5 campuri private ale clasei Gimnast.
     */

    @Override
    public void executaAntrenament() {
        System.out.println(getNume() + " (Gimnast) exersează elementele de dificultate " + scorDificultate + " la " + aparatPreferat + ".");
    }

    @Override
    public void participaLaCompetitie() {
        System.out.println(getNume() + " intră în concurs la proba de " + aparatPreferat + " având " + numarMedalii + " medalii.");
    }
    /*
     * EXPLICATIE SECVENTA (Metodele din interfata - Cerinta 1):
     * Implementeaza cele 2 metode din ActivitateSportiva.
     * Am modificat accesul la nume folosind getNume(), deoarece campul nume este acum private in Sportiv.
     */

    @Override
    public String toString() {
        return "Gimnast [" + super.toString() +
                ", Aparat: " + aparatPreferat +
                ", Scor dificultate: " + scorDificultate +
                ", Medalii: " + numarMedalii +
                ", Nivel: " + nivelExperienta +
                ", Lot Național: " + (esteInLotulNational ? "Da" : "Nu") + "]";
    }
    /*
     * EXPLICATIE SECVENTA (Metoda toString):
     * Combina textul returnat de Sportiv (super.toString()) cu cele 5 campuri proprii ale gimnastului.
     */
}