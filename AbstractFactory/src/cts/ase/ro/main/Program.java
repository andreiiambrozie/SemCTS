package cts.ase.ro.main;

import cts.ase.ro.clase.*;

public class Program {

    public static void afisareInfoPersonal(iFactory factory,String nume){
        PersonalSpital personalSpital=factory.getPersonal(nume);
        System.out.println(personalSpital.toString());
    }
    public static void main(String[] args){
        afisareInfoPersonal(new FactoryAsistent(),"Del");
        afisareInfoPersonal(new FactoryMedic(),"Doc");
        afisareInfoPersonal(new FactoryInfirmier(),"Ditu");
    }
}
