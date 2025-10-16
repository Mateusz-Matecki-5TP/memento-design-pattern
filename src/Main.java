import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Juan", "Pablo", LocalDate.of(1990, 1, 2), "Warszawa", "juano@pablo.secundo", 694202137);
        PersonBackup backup = new PersonBackup(person);

        backup.save("Stan początkowy");
        System.out.println("Aktualnie: " + person);

        person.restore(new Snapshot("Juan", "Pablo", LocalDate.of(1990, 1, 2), "Warszawa", "juano@pablo.secundo", 123456789));
        backup.save("Po zmianie numeru telefonu");
        System.out.println("Zmienione dane: " + person);

        System.out.println();
        System.out.println("Historia:");
        backup.listHistory();

        backup.restore(0);
        System.out.println();
        System.out.println("Przywrócona wersja 0: " + person);
    }
}
