package sandbox.JohnsFoto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Foto implements Comparable<Foto> {
    private String id;
    private int numericId;
    private String name;
    private LocalDateTime wasCreated;
    private String city;

    public Foto(String name, String wc, String city) {

        String str = wc;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
        this.name = name;
        this.wasCreated = dateTime;
        this.city = city;
    }

    @Override
    public int compareTo(Foto o) {
        return wasCreated.compareTo(o.wasCreated);
    }

    @Override
    public String toString() {
        return;
    }
}
