package main;

import clase.adapterEx5.AdapterSoft;
import clase.adapterEx5.Factura;
import clase.adapterEx5.Soft;
import clase.builder.Rezervare;
import clase.builder.RezervareBuilder;
import clase.factoryMethod_simpleFactory.*;
import clase.facadeEx6.FacadeMasa;
import clase.facadeEx6.Masa;

public class Main {

    public static void main(String[] args) {
        //1-factory method

        iFactory soupsFactory = new FactorySupaCiuperci();
        Supa supa = soupsFactory.getSupa(20);
        System.out.println(supa);

        iFactory beefFactory = new FactorySupaVita();
        Supa supavita = beefFactory.getSupa(30);
        System.out.println(supavita);


        //2-builder metoda cu reutilizare builderului
        RezervareBuilder rezervareBuilder = new RezervareBuilder();

        Rezervare rezervare = rezervareBuilder.setCodRez(10).build();
        System.out.println(rezervare);

        Rezervare rezervareBoierie = rezervareBuilder.setCodRez(1).setDecorareMasa(true)
                .setScaunErgonomic(true).areMuzicaAmbPers(true).setGenMuzica("Manea").build();
        System.out.println(rezervareBoierie);

        //3-simpleFactory
        SimpleFactorySupa simpleFactorySupa = new SimpleFactorySupa();
        Supa supaNoua = simpleFactorySupa.creareSupa(TipSupa.SupaDeVita, 15);
        System.out.println(supaNoua);

        //5-adapter --nush daca trb sa mi creez factura


        Factura factura = new Factura(15);
        Soft soft = new Soft(factura);
        soft.printare();

        AdapterSoft softNou = new AdapterSoft(soft);
        softNou.printeazaSoftNou();

        //6 facade
        Masa m = new Masa(true, true, false);
        Masa m1 = new Masa(true, true, true);

        FacadeMasa.verificareMasa(m);
        FacadeMasa.verificareMasa(m1);
    }
}
