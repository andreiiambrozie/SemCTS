package ro.ase.cts.program;

import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervareBuilder;
import ro.ase.cts.clase.RezervareBuilderV2;

public class Main {

    public static void main(String[] args){
        Rezervare rezervare1;
        Rezervare rezervare2;

        RezervareBuilder rezervareBuilder=new RezervareBuilder(50);

        rezervareBuilder.setMancare(true);
        rezervare1=rezervareBuilder.build();

        rezervare2=new RezervareBuilder(15).setCodRezervare(15).setGenMuzica("Rock").build();

        Rezervare rezervare3=new Rezervare(102
                ,true,
                true,
                true,
                false,"-");

        Rezervare rezervare4;
        rezervareBuilder.setCodRezervare(104).setAreScaunErg(true);
        rezervare4=rezervareBuilder.build();

        System.out.println(rezervare1);
        System.out.println(rezervare2);
        System.out.println(rezervare3);
        System.out.println(rezervare4);

        RezervareBuilderV2 rezervareBuilderV2=new RezervareBuilderV2()
                .setAreBautura(true).setAreMancare(true).setAreScaunErgonomic(true);

        Rezervare rezervare5=rezervareBuilderV2.setCodRezervare(140).build();
        Rezervare rezervare6=rezervareBuilderV2.setCodRezervare(150).build();
    }
}
