package collection;

/**
 * Created by Пользователь on 24.05.2017.
 */
public class Human implements Comparable<Human>{
    private String name;
    private long phoneNumber;

    public Human(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public int compareTo(Human o) {
        return name.compareTo(o.getName());
    }
}
