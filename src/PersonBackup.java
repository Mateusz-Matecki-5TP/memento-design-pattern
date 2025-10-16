import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PersonBackup {
    record HistoryEntry(LocalDateTime timestamp, String note, Snapshot memento) {}

    private final Person person;
    private final List<HistoryEntry> history = new ArrayList<>();

    public PersonBackup(Person person) {
        this.person = person;
    }

    public void save(String note) {
        history.add(new HistoryEntry(LocalDateTime.now(), note, person.createMemento()));
    }

    public void restore(int index) {
        if (index < 0 || index >= history.size()) {
            throw new IndexOutOfBoundsException("Brak takiej wersji");
        }
        person.restore(history.get(index).memento());
    }

    public void listHistory() {
        for (int i = 0; i < history.size(); i++) {
            HistoryEntry history = this.history.get(i);
            System.out.println(i + ": " + history.timestamp() + " [" + history.note() + "]");
        }
    }
}
