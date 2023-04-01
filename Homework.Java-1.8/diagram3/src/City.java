import java.util.ArrayList;

public class City {
    private String name;
    private ArrayList<Hotel> hotels = new ArrayList<>();
    private ArrayList<Person> persons = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}