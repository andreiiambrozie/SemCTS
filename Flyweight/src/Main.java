public class Main {

    public static void main(String[] args) {

        //reduce spatiul de memorie utilizat
        Rezervare rezervare1=new Rezervare(7,4,15);
        Rezervare rezervare2=new Rezervare(8,2,10);
        Rezervare rezervare3=new Rezervare(10,6,17);
        Rezervare rezervare4=new Rezervare(7,4,18);

        FlyweightFactory flyweightFactory=new FlyweightFactory();
        Client client1= (Client) flyweightFactory.getFlyweight("05432");
        client1.printeazaRezervare(rezervare1);

        Flyweight client=flyweightFactory.getFlyweight("05432");
        client.printeazaRezervare(rezervare2);

        flyweightFactory.getFlyweight("1234").printeazaRezervare(rezervare3);
        flyweightFactory.getFlyweight("1234").printeazaRezervare(rezervare4);
    }
}
