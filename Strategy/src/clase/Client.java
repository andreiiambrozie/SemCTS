package clase;

public class Client {
    private iPlata plata;
    private String nume;

    public Client(String nume) {
        this.nume = nume;
        this.plata=new PlataCash();
    }

    //setter pt "strategie" obligatoriu
    public void setPlata(iPlata plata) {
        this.plata = plata;
    }

    public void plateste(float sum){
        System.out.println("Clientul "+this.nume+" are de platit suma de: "+sum);
        plata.plateste(sum);
    }
}
