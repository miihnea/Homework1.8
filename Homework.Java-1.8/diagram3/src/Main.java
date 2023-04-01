import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Address address1=new Address("Street A",123);
        Address address2=new Address("Street B",789);
        Person person=new Person("Marin",address1);
        System.out.println("Initial address");
        person.personAddress();
        person.setAddress(address2);
        System.out.println("Address after change");
        person.personAddress();
        City city1= new City("City One");
        City city2= new City("City Two");
        Hotel hotel1 = new Hotel("Hotel One", address1,city1);
        Hotel hotel2 = new Hotel("Hotel Two", address2, city2);
        Hotel hotel3 = new Hotel("Hotel Three", address1,city1);
        ArrayList <Hotel> hotels=new ArrayList<>();
        hotels.add(hotel1);
        hotels.add(hotel2);
        hotels.add(hotel3);

        Person person1 = new Person("Person One", address1);
        Person person2 = new Person("Person Two", address2);
        Tourist tourist1 = new Tourist("Tourist One",address1);
        Tourist tourist2 = new Tourist("Tourist Two",address2);

        System.out.println();
        System.out.println("Tourists in hotel1");
        hotel1.addTourist(tourist1);
        hotel1.addTourist(tourist2);
        hotel1.printTourists();
        System.out.println("Tourists in hotel2 after moves");
        hotel2.printTourists();
        hotel2.moveTourist(hotel1,tourist1);
        hotel2.printTourists();
        System.out.println();
        System.out.println("Hotels situated in city1");
        for(int i=0;i<hotels.size();i++)
        {
            if(hotels.get(i).getCity()==city1)
                hotels.get(i).printHotelName();
        }

    }
}