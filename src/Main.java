import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person(
            "Juan",
            "Pablo",
            Date.from(Instant.parse("1990-01-02T00:00:00Z")),
            "Warszawa",
            "juano@pablo.secundo",
            694202137
        );

        PersonBackup backup = new PersonBackup(person);
        backup.save("Stan początkowy");

        while (true) {
            System.out.println("====================================");
            System.out.println("         AKTUALNE DANE OSOBY");
            System.out.println("====================================");
            System.out.println(person);
            System.out.println("\nMENU:");
            System.out.println("1. Zmień dane");
            System.out.println("2. Zapisz aktualny stan");
            System.out.println("3. Historia");
            System.out.println("0. Wyjście");
            System.out.print("Wybierz opcję: ");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    changeData(person, scanner);
                    break;

                case "2":
                    System.out.print("Nazwa backupu: ");
                    String desc = scanner.nextLine();
                    backup.save(desc);
                    System.out.println("Zapisano.\n");
                    break;

                case "3":
                    showHistoryMenu(backup, scanner);
                    break;

                case "0":
                    return;

                default:
                    System.out.println("Niepoprawna opcja!\n");
            }
        }
    }

    private static void changeData(Person person, Scanner scanner) {
        System.out.println("--- Zmiana aktualnych danych ---");

        System.out.print("Imię (" + person.getImie() + "): ");
        String imie = scanner.nextLine();
        if (!imie.isEmpty()) person.setImie(imie);

        System.out.print("Nazwisko (" + person.getNazwisko() + "): ");
        String nazwisko = scanner.nextLine();
        if (!nazwisko.isEmpty()) person.setNazwisko(nazwisko);

        System.out.print("Miejsce urodzenia (" + person.getMiejsceUrodzenia() + "): ");
        String miejsce = scanner.nextLine();
        if (!miejsce.isEmpty()) person.setMiejsceUrodzenia(miejsce);

        System.out.print("Email (" + person.getEmail() + "): ");
        String email = scanner.nextLine();
        if (!email.isEmpty()) person.setEmail(email);

        System.out.print("Telefon (" + person.getTelefon() + "): ");
        String tel = scanner.nextLine();
        if (!tel.isEmpty()) person.setTelefon(Integer.parseInt(tel));

        System.out.println("Dane zostały zmienione.\n");
    }

    private static void showHistoryMenu(PersonBackup backup, Scanner scanner) {
        System.out.println("\n===== HISTORIA ZMIAN =====");
        backup.listHistory();

        System.out.print("Podaj numer wersji do przywrócenia (lub Enter aby wrócić): ");
        String val = scanner.nextLine();

        if (!val.isEmpty()) {
            int index = Integer.parseInt(val);
            if (!backup.restore(index)) {
                System.out.println("Niepoprawny numer.\n");
                return;
            }

            System.out.println("Przywrócono wersję nr " + index + ".\n");
        }
    }
}
