public abstract class Sportiv implements ActivitateSportiva { // Declară clasa părinte abstractă Sportiv care implementează interfața ActivitateSportiva
    protected String nume; // Declară atributul nume (text), accesibil și din clasele derivate (protected)
    protected int varsta; // Declară atributul varsta (număr întreg), accesibil și din clasele derivate
    protected String club; // Declară atributul club (text), accesibil și din clasele derivate

    public Sportiv(String nume, int varsta, String club) { // Declară constructorul clasei Sportiv, care primește 3 parametri
        this.nume = nume; // Atribuie parametrul nume câmpului nume al obiectului curent
        this.varsta = varsta; // Atribuie parametrul varsta câmpului varsta al obiectului curent
        this.club = club; // Atribuie parametrul club câmpului club al obiectului curent
    } // Închide constructorul clasei Sportiv

    public String getNume() { // Declară o metodă getter care returnează numele sportivului
        return nume; // Returnează valoarea atributului nume
    } // Închide metoda getNume

    public void afiseazaProfil() { // Declară o metodă care afișează datele generale ale sportivului
        System.out.println("Sportiv: " + nume + " | Vârstă: " + varsta + " ani | Club: " + club); // Afișează în consolă numele, vârsta și clubul sportivului
    } // Închide metoda afiseazaProfil
} // Închide clasa Sportiv