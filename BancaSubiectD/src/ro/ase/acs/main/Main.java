package ro.ase.acs.main;

import ro.ase.acs.clase.command15.*;
import ro.ase.acs.clase.flyweight10.Cont;
import ro.ase.acs.clase.flyweight10.Flyweight;
import ro.ase.acs.clase.flyweight10.FlyweightFactory;
import ro.ase.acs.clase.strategy11.Persoana;
import ro.ase.acs.clase.strategy11.StrategyPersJuridica;

public class Main {
    public static void main(String[] args) {

        //10
        Cont cont1=new Cont(1,400,"BCR","Rahova");
        Cont cont2=new Cont(2,1500,"BRD","Ptm");
        Cont cont3=new Cont(3,1200,"BCR","Colentina");

        //11
        FlyweightFactory flyweightFactory=new FlyweightFactory();

        Flyweight detinator=flyweightFactory.getFlyweight("MGK");

        Flyweight detinator1= flyweightFactory.getFlyweight("Alberto");

        detinator.afiseazCont(cont1);
        detinator1.afiseazCont(cont2);
        detinator.afiseazCont(cont3);


        Persoana persoana=new Persoana("Amb");
        Persoana persoana1=new Persoana("Ditu");

        persoana.prezintaDocomente();
        persoana1.setStrategieTipClient(new StrategyPersJuridica());
        persoana1.prezintaDocomente();

        //15

        Operator operator=new Operator();

        ContCom contCom=new ContCom(1);
        ContCom contCom1=new ContCom(10);

        iCommand comanda=new ComandaConstituire(contCom);
        iCommand command1=new ComandaDepunere(contCom);

        operator.invocaComanda(command1);
        operator.invocaComanda(comanda);

        operator.executaComanda(50);
        operator.executaComanda(100);

    }
}
