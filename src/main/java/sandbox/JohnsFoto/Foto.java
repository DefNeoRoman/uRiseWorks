package sandbox.JohnsFoto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Foto implements Comparable<Foto> {
    private Integer id;
    private int numericId;
    private String name;
    private String extension;
    private LocalDateTime wasCreated;
    private String city;

    public Foto(String name, String wc, String city) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(wc, formatter);
        this.name = name;
        this.wasCreated = dateTime;
        this.city = city;
        String [] a = name.split("\\.");
        this.extension = a[1];
    }

    public Foto(Integer id, String name, String wasCreated, String city) {
        this(name,wasCreated,city);
        this.id = id;

    }

    @Override
    public int compareTo(Foto o) {
        return wasCreated.compareTo(o.wasCreated);
    }

    @Override
    public String toString() {
        return city+id+"."+extension;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public String getWasCreated() {
        String s = wasCreated.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return s;
    }
}
