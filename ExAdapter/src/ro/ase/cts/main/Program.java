package ro.ase.cts.main;

import ro.ase.cts.clase.Bilet;
import ro.ase.cts.clase.BiletAdapter;
import ro.ase.cts.clase.BiletAdapterClasa;
import ro.ase.cts.clase.iBiletOnline;

public class Program {

    private static void rezervaSiAfiseazaBilet(Bilet bilet){
        bilet.rezervare();
        bilet.vanzare();
    }

    private static void rezervaSiAfiseazaBiletOnline(iBiletOnline bilet){
        bilet.rezervaBiletOnline();
        bilet.vindeBiletOnline();
    }
    public static void main(String[] args){

        Bilet bilet=new Bilet(30);
        rezervaSiAfiseazaBilet(bilet);

        BiletAdapter biletAdapter=new BiletAdapter(bilet);
        rezervaSiAfiseazaBiletOnline(biletAdapter);

        iBiletOnline biletAdapterClasa=new BiletAdapterClasa(20);
        rezervaSiAfiseazaBiletOnline(biletAdapterClasa);
    }
}
