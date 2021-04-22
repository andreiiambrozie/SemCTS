package clase;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionException;

public class Operator {
    private List<Comanda> listaComenzi;

    public Operator() {
        this.listaComenzi = new ArrayList<Comanda>();
    }

    public void invoca(Comanda comanda){
        this.listaComenzi.add(comanda);
    }

    public void executaComanda(){
        listaComenzi.get(0).executa(); //extragem comanda pe principiul FIFO
        listaComenzi.remove(0);
    }


}
