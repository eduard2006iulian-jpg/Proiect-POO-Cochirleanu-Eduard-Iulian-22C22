public class Voleibalist extends Sportiv {

    private String post;
    private int inaltimeSarituraCm;
    private int numarTricou;
    private double punctePeMeci;
    private boolean esteCapitan;
    /*
     * EXPLICATIE SECVENTA (Campuri private):
     * Am adaugat 5 campuri private specifice voleibalistului.
     * Impreuna cu cele 5 din Sportiv, avem 10 campuri in total (Cerinta 2).
     */

    public Voleibalist() {
        super();
        this.post = "Rezervă";
        this.inaltimeSarituraCm = 0;
        this.numarTricou = 0;
        this.punctePeMeci = 0.0;
        this.esteCapitan = false;
    }
    /*
     * EXPLICATIE SECVENTA (Constructor fara argumente):
     * Apeleaza constructorul gol al parintelui si initializeaza campurile proprii cu valori implicite.
     */

    public Voleibalist(String nume, int varsta, String club, double inaltimeCm, double greutateKg,
                       String post, int inaltimeSarituraCm, int numarTricou,
                       double punctePeMeci, boolean esteCapitan) {
        super(nume, varsta, club, inaltimeCm, greutateKg);
        this.post = post;
        this.inaltimeSarituraCm = inaltimeSarituraCm;
        this.numarTricou = numarTricou;
        this.punctePeMeci = punctePeMeci;
        this.esteCapitan = esteCapitan;
    }
    /*
     * EXPLICATIE SECVENTA (Constructor cu toate argumentele):
     * Initializeaza cele 5 campuri mostenite prin super(...) si cele 5 campuri specifice voleibalistului.
     */

    public Voleibalist(Voleibalist altVoleibalist) {
        super(altVoleibalist);
        this.post = altVoleibalist.post;
        this.inaltimeSarituraCm = altVoleibalist.inaltimeSarituraCm;
        this.numarTricou = altVoleibalist.numarTricou;
        this.punctePeMeci = altVoleibalist.punctePeMeci;
        this.esteCapitan = altVoleibalist.esteCapitan;
    }
    /*
     * EXPLICATIE SECVENTA (Constructor de copiere):
     * Cloneaza un obiect Voleibalist existent, copiind atat datele din Sportiv, cat si pe cele proprii.
     */

    public String getPost() { return post; }
    public void setPost(String post) { this.post = post; }

    public int getInaltimeSarituraCm() { return inaltimeSarituraCm; }
    public void setInaltimeSarituraCm(int inaltimeSarituraCm) { this.inaltimeSarituraCm = inaltimeSarituraCm; }

    public int getNumarTricou() { return numarTricou; }
    public void setNumarTricou(int numarTricou) { this.numarTricou = numarTricou; }

    public double getPunctePeMeci() { return punctePeMeci; }
    public void setPunctePeMeci(double punctePeMeci) { this.punctePeMeci = punctePeMeci; }

    public boolean isEsteCapitan() { return esteCapitan; }
    public void setEsteCapitan(boolean esteCapitan) { this.esteCapitan = esteCapitan; }
    /*
     * EXPLICATIE SECVENTA (Metode Get si Set):
     * Permit citirea si modificarea celor 5 campuri private ale clasei Voleibalist.
     */

    @Override
    public void executaAntrenament() {
        System.out.println(getNume() + " (Voleibalist - " + post + ") face antrenament de blocaj și atac cu o săritură de " + inaltimeSarituraCm + " cm.");
    }

    @Override
    public void participaLaCompetitie() {
        System.out.println(getNume() + " joacă titular pe postul de " + post + " în meciul oficial al clubului " + getClub() + ".");
    }
    /*
     * EXPLICATIE SECVENTA (Metodele din interfata - Cerinta 1):
     * Implementeaza cele 2 metode obligatorii din ActivitateSportiva.
     * Folosesc getNume() si getClub() pentru ca atributele din Sportiv sunt acum private.
     */

    @Override
    public String toString() {
        return "Voleibalist [" + super.toString() +
                ", Post: " + post +
                ", Săritură: " + inaltimeSarituraCm + " cm" +
                ", Nr. tricou: " + numarTricou +
                ", Puncte/meci: " + punctePeMeci +
                ", Căpitan: " + (esteCapitan ? "Da" : "Nu") + "]";
    }
    /*
     * EXPLICATIE SECVENTA (Metoda toString):
     * Returneaza toate cele 10 caracteristici ale voleibalistului, preluand primele 5 din clasa parinte.
     */
}