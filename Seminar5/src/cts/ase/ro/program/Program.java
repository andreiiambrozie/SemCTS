package cts.ase.ro.program;

import cts.ase.ro.clase.FactoryPersonal;
import cts.ase.ro.clase.PersonalSpital;
import cts.ase.ro.clase.TipPersonal;

public class Program {
    public static void main(String[] args){
        FactoryPersonal factoryPersonal=new FactoryPersonal();

        PersonalSpital asistent=factoryPersonal.createPersonal(TipPersonal.Asistent,"Sutu");
        PersonalSpital medic=factoryPersonal.createPersonal(TipPersonal.Medic,"DOC");

        System.out.println(asistent.toString());
        System.out.println(medic.toString());
    }
}
