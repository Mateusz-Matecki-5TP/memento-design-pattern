import java.time.LocalDate;

public class Snapshot {
    private final String imie;
    private final String nazwisko;
    private final LocalDate dataUrodzenia;
    private final String miejsceUrodzenia;
    private final String email;
    private final int telefon;

    Snapshot(String imie, String nazwisko, LocalDate dataUrodzenia, String miejsceUrodzenia, String email, int telefon) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.miejsceUrodzenia = miejsceUrodzenia;
        this.email = email;
        this.telefon = telefon;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public String getMiejsceUrodzenia() {
        return miejsceUrodzenia;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefon() {
        return telefon;
    }
}
