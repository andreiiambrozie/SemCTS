package clase;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerSalaAbstract {
    private List<Observator> listaObservatori;

    public ManagerSalaAbstract() {
        this.listaObservatori=new ArrayList<>();
    }

    public void adaugaObservator(Observator observator){
        listaObservatori.add(observator);
    }

    public void stergeObservator(Observator observator){
        listaObservatori.remove(observator);
        System.out.println("S a dezabonat ");
    }

    public void trimiteMesajToObservator(String mesaj){
        for(Observator observator:listaObservatori){
            observator.primesteMesaj(mesaj);
        }
    }
}
