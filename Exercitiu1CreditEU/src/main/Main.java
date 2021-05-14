package main;

import Proxy1.clase.Client;
import Proxy1.clase.ProxyAcordareCredit;
import Strategy2.clase.ClientNou;
import Strategy2.clase.Locuinta;
import Strategy2.clase.StrategiePretMPatrat;
import Strategy2.clase.StrategiePretNrCamere;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Client client=new Client(28,3000,"jon");
        Client client1=new Client(19,2500,"Amb");
        Client client2=new Client(30,1500,"Alin");

        ProxyAcordareCredit proxyAcordareCredit=new ProxyAcordareCredit(client);
        proxyAcordareCredit.acordaCredit(1000);

        ProxyAcordareCredit proxyAcordareCredit1=new ProxyAcordareCredit(client1);
        proxyAcordareCredit1.acordaCredit(4000);

        ProxyAcordareCredit proxyAcordareCredit2=new ProxyAcordareCredit(client2);
        proxyAcordareCredit2.acordaCredit(20000);

        //2

        ClientNou clientNou=new ClientNou(150000);
        ClientNou clientNou1=new ClientNou(200000);
        ClientNou clientSARAC=new ClientNou(30000);
        Locuinta locuinta=new Locuinta(5,150000,160);
        Locuinta locuinta1=new Locuinta(4,210000,120);
        Locuinta locuinta2=new Locuinta(7,450000,300);

        List<Locuinta> listeLocuinte=new ArrayList<>();
        listeLocuinte.add(locuinta);
        listeLocuinte.add(locuinta1);
        listeLocuinte.add(locuinta2);

        clientNou1.setStrategie(new StrategiePretNrCamere());

        clientNou.calculPretMinim(listeLocuinte,clientNou);
        clientNou1.calculPretMinim(listeLocuinte,clientNou1);
        clientSARAC.calculPretMinim(listeLocuinte, clientSARAC);

        ClientNou bulangiu=new ClientNou(500000);
        bulangiu.setStrategie(new StrategiePretMPatrat());
        bulangiu.calculPretMinim(listeLocuinte,bulangiu);
    }
}
