import java.time.LocalDate;

public class Customer {
    protected String name;
    protected int frequency;
    protected LocalDate time;

    public Customer(String name, int frequency, LocalDate time) {
        this.name = name;
        this.frequency = frequency;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name:" + name +
                ", frequency:" + frequency +
                ", time:" + time +
                '}';
    }
}
