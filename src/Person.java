import java.util.Date;

public class Person {
    private String imie;
    private String nazwisko;
    private Date dataUrodzenia;
    private String miejsceUrodzenia;
    private String email;
    private Integer telefon;

    public Person(String imie, String nazwisko, Date dataUrodzenia, String miejsceUrodzenia, String email, Integer telefon) {
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

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getMiejsceUrodzenia() {
        return miejsceUrodzenia;
    }

    public void setMiejsceUrodzenia(String miejsceUrodzenia) {
        this.miejsceUrodzenia = miejsceUrodzenia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefon() {
        return telefon;
    }

    public void setTelefon(Integer telefon) {
        this.telefon = telefon;
    }
}