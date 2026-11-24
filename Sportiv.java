public abstract class Sportiv implements ActivitateSportiva {

    private String nume;
    private int varsta;
    private String club;
    private double inaltimeCm;
    private double greutateKg;
    /*
     * EXPLICATIE SECVENTA (Campuri private):
     * Am transformat campurile din protected in private (Cerinta 2) si am adaugat
     * inca 2 campuri (inaltimeCm, greutateKg), ajungand la 5 campuri in clasa parinte.
     */

    public Sportiv() {
        this.nume = "Necunoscut";
        this.varsta = 0;
        this.club = "Fără club";
        this.inaltimeCm = 0.0;
        this.greutateKg = 0.0;
    }
    /*
     * EXPLICATIE SECVENTA (Constructor fara argumente):
     * Initializeaza un obiect Sportiv cu valori implicite atunci cand nu ii transmitem date la creare.
     */

    public Sportiv(String nume, int varsta, String club, double inaltimeCm, double greutateKg) {
        this.nume = nume;
        this.varsta = varsta;
        this.club = club;
        this.inaltimeCm = inaltimeCm;
        this.greutateKg = greutateKg;
    }
    /*
     * EXPLICATIE SECVENTA (Constructor cu toate argumentele):
     * Primeste toate cele 5 valori ca parametri si le atribuie campurilor obiectului curent.
     */

    public Sportiv(Sportiv altSportiv) {
        this.nume = altSportiv.nume;
        this.varsta = altSportiv.varsta;
        this.club = altSportiv.club;
        this.inaltimeCm = altSportiv.inaltimeCm;
        this.greutateKg = altSportiv.greutateKg;
    }
    /*
     * EXPLICATIE SECVENTA (Constructor de copiere):
     * Creeaza un obiect nou copiind exact valorile unui alt obiect Sportiv deja existent.
     */

    public String getNume() { return nume; }
    public void setNume(String nume) { this.nume = nume; }

    public int getVarsta() { return varsta; }
    public void setVarsta(int varsta) { this.varsta = varsta; }

    public String getClub() { return club; }
    public void setClub(String club) { this.club = club; }

    public double getInaltimeCm() { return inaltimeCm; }
    public void setInaltimeCm(double inaltimeCm) { this.inaltimeCm = inaltimeCm; }

    public double getGreutateKg() { return greutateKg; }
    public void setGreutateKg(double greutateKg) { this.greutateKg = greutateKg; }
    /*
     * EXPLICATIE SECVENTA (Metode Get si Set):
     * Deoarece campurile sunt private, aceste metode publice permit citirea (get)
     * si modificarea (set) valorilor din afara clasei (incapsulare).
     */

    @Override
    public String toString() {
        return "Nume: " + nume +
                ", Vârstă: " + varsta + " ani" +
                ", Club: " + club +
                ", Înălțime: " + inaltimeCm + " cm" +
                ", Greutate: " + greutateKg + " kg";
    }
    /*
     * EXPLICATIE SECVENTA (Metoda toString):
     * Returneaza un sir de caractere cu toate cele 5 caracteristici ale clasei Sportiv,
     * folosit pentru afisarea rapida a obiectului in consola.
     */
}