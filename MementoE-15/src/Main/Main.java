package Main;

import clase.ManagerMemento;
import clase.Meci;

import java.lang.reflect.Member;

public class Main {

    public static void main(String[] args) {
        Meci meci=new Meci("CFR","FCSB",
                15000,13500,50,25);


        ManagerMemento managerMemento=new ManagerMemento();
        managerMemento.adaugaMemento(meci.creareMemento());

        meci.setNrSpectatori(12000);
        managerMemento.adaugaMemento(meci.creareMemento());

        System.out.println(meci);

        meci.setEchipaOaspete("Sepsi");

        System.out.println(meci);

        meci.setareMemento(managerMemento.getLastMemento());

        System.out.println(meci);
    }
}
