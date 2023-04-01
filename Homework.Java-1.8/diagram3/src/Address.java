public class Address {
    private String street;
    private int number;
    Address(String street,int number)
    {
        this.street=street;
        this.number=number;
    }
    public void display()
    {
        System.out.println(street+" "+number);
    }
}
