package ro.ase.acs.main;

import ro.ase.acs.clase.CompositeAgentie;
import ro.ase.acs.clase.FilialaFrunza;

import java.util.logging.FileHandler;

public class Main {
    public static void main(String[] args) {
        CompositeAgentie ag1=new CompositeAgentie();
        CompositeAgentie ag2=new CompositeAgentie();
        CompositeAgentie ag3=new CompositeAgentie();

        FilialaFrunza fr1=new FilialaFrunza("Ambis");
        FilialaFrunza fr2=new FilialaFrunza("Ditus");
        FilialaFrunza fr3=new FilialaFrunza("Nutus");
        FilialaFrunza fr4=new FilialaFrunza("Brabus");

        ag1.adaugaNod(fr1);
        ag1.adaugaNod(fr2);
        ag2.adaugaNod(fr3);
        ag3.adaugaNod(fr4);
        ag1.adaugaNod(ag3);



        ag3.stergeNod(fr4);
        ag1.adaugaNod(fr4);
        ag1.stergeNod(ag3);

        ag1.afiseazaDescriere();
        System.out.println();
        ag2.afiseazaDescriere();
    }
}
