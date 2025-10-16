import java.time.LocalDate;

public class Person {
    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private String miejsceUrodzenia;
    private String email;
    private int telefon;

    public Person(String imie, String nazwisko, LocalDate dataUrodzenia, String miejsceUrodzenia, String email, int telefon) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.miejsceUrodzenia = miejsceUrodzenia;
        this.email = email;
        this.telefon = telefon;
    }

    public Snapshot createMemento() {
        return new Snapshot(imie, nazwisko, dataUrodzenia, miejsceUrodzenia, email, telefon);
    }

    public void restore(Snapshot m) {
        this.imie = m.getImie();
        this.nazwisko = m.getNazwisko();
        this.dataUrodzenia = m.getDataUrodzenia();
        this.miejsceUrodzenia = m.getMiejsceUrodzenia();
        this.email = m.getEmail();
        this.telefon = m.getTelefon();
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + ", " + dataUrodzenia + ", " + miejsceUrodzenia + ", " + email + ", " + telefon;
    }
}