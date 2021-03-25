package ro.ase.cts.program;

import ro.ase.cts.clase.Balada;
import ro.ase.cts.clase.Presedinte;
import ro.ase.cts.clase.PresedinteLazy;

public class Program {

    public static void main(String[] args){
        Presedinte presedinte1=Presedinte.getInstance();
        Presedinte presedinte2=Presedinte.getInstance();

        System.out.println(presedinte1.toString());
        System.out.println(presedinte2.toString());

        presedinte1.setNume("Klaus");
        presedinte2.setMandat(1);


        System.out.println(presedinte1.toString());
        System.out.println(presedinte2.toString());

        PresedinteLazy presedinteLazy1=PresedinteLazy.getInstance("Macron",43,1);
        PresedinteLazy presedinteLazy2=PresedinteLazy.getInstance("Merkel",64,3);

        System.out.println(presedinteLazy1);
        System.out.println(presedinteLazy2);

        Balada balada1=Balada.getInstance("Haiducu",3,true);
        Balada balada2=Balada.getInstance("Balada unui greier mic",6,false);

        System.out.println(balada1.toString());
        System.out.println(balada2.toString());

        balada2.setTitlu("Hanul cu Tei");
        System.out.println(balada2.toString());



    }
}
