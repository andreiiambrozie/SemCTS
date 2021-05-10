package ro.ase.acs.clase;

import jdk.jshell.spi.ExecutionControl;

public class FilialaFrunza implements iSediu {
private String numeFiliala;
    public FilialaFrunza(String numeFiliala) {
        super();
        this.numeFiliala=numeFiliala;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Este filiala "+numeFiliala);
    }

    @Override
    public void adaugaNod(iSediu iSediu) throws Exception {
        throw new Exception("Nu este implementat");
    }

    @Override
    public void stergeNod(iSediu iSediu) throws Exception {
        throw new Exception("Nu este implementat");

    }

    @Override
    public iSediu getNod(int poz) throws Exception {
        throw new Exception("Nu este implementat");

    }
}
