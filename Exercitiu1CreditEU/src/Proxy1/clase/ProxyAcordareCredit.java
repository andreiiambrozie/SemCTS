package Proxy1.clase;

public class ProxyAcordareCredit implements iClient{

    private Client client;

    public ProxyAcordareCredit(Client client) {
        this.client = client;
    }

    @Override
    public void acordaCredit(int suma) {
        if(this.client.getVarsta()>=21 && this.client.getVarsta()<=60){
            if(this.client.getSalariu()>=2500){
                client.acordaCredit(suma);
            }else System.out.println("Salariu prea mic");
        }else System.out.println("Varsta nu e buna");

        System.out.println(client);
    }
}
