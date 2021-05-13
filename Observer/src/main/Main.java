package main;

import clase.Client;
import clase.Manager;
import clase.ManagerSalaAbstract;

public class Main {

    public static void main(String[] args) {

        //SUBIECTUL E- 12

        Manager manager=new Manager();

        Client client=new Client("Bobi");
        Client client1=new Client("Bobo");
        Client client2=new Client("Bubu");

        manager.adaugaObservator(client);
        manager.adaugaObservator(client1);
        manager.adaugaObservator(client2);

        manager.anuntaMeci("FCSB v CFR tonight boyz");

        manager.stergeObservator(client2);

    }
}
