import java.time.LocalDate;
import java.util.Date;

public class Snapshot {
    private final String imie;
    private final String nazwisko;
    private final Date dataUrodzenia;
    private final String miejsceUrodzenia;
    private final String email;
    private final Integer telefon;

    Snapshot(String imie, String nazwisko, Date dataUrodzenia, String miejsceUrodzenia, String email, Integer telefon) {
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

    public Date getDataUrodzenia() {
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
