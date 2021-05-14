package Strategy2.clase;

import java.util.ArrayList;
import java.util.List;

public class ClientNou {
    private int valoareCredit;
    private iStrategie strategie;

    public ClientNou(int valoareCredit) {
        this.valoareCredit = valoareCredit;
        this.strategie=new StrategiePretMPatrat();
    }

    public int getValoareCredit() {
        return valoareCredit;
    }

    public void setStrategie(iStrategie strategie) {
        this.strategie = strategie;
    }

    public void calculPretMinim(List<Locuinta> listaLocuinte,ClientNou clientNou){
        System.out.println("CLIENT NOU");
        strategie.calculPretMinim(listaLocuinte,this);
    }
}
