public class Person {
    protected String name;
    private Address address;
    Person(String name,Address address)
    {
        this.name=name;
        this.address=address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void personAddress()
    {
        address.display();
    }
}
