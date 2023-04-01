import java.util.ArrayList;

public class Hotel {
    private String name;
    private Address address;
    private City city;
    private ArrayList <Tourist> tourists = new ArrayList<>();
    public Hotel(String name, Address address, City city) {
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public void addTourist(Tourist tourist)
    {
        tourists.add(tourist);
    }
    public void removeTourists(Tourist tourist)
    {
        tourists.remove(tourist);
    }

    public void moveTourist(Hotel hotel,Tourist tourist)
    {
        this.addTourist(tourist);
        hotel.removeTourists((tourist));

    }
    public void printTourists()
    {
        for(int i=0;i<tourists.size();i++)
            tourists.get(i).displayTouristName();
    }
    public City getCity() {
        return city;
    }
    public void printHotelName()
    {
        System.out.println(name);
    }
}