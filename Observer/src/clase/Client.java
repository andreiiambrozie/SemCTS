package clase;

public class Client implements Observator{

    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(nume+" primeste mesajul: "+mesaj);
    }


}
