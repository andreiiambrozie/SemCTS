package ro.ase.acs.main;

import ro.ase.acs.clase.Persoana;
import ro.ase.acs.clase.VerificatorPersoaneFacade;
import ro.ase.acs.proxy.Moneda;
import ro.ase.acs.proxy.OperatorCredite;
import ro.ase.acs.proxy.ProxyOperatorCredite;

public class Main {
    public static void main(String[] args) {
        Persoana persoana=new Persoana("Amb","5000312440025");
       if(VerificatorPersoaneFacade.esteEligibil(persoana)){
           System.out.println("Ii putem acorda creditul");
       }else
           System.out.println("Nu ii putem acorda creditul");


        OperatorCredite operatorCredite=new OperatorCredite();
        operatorCredite.creareCredit(Moneda.CHF,30000);

        ProxyOperatorCredite proxyOp=new ProxyOperatorCredite(operatorCredite);
        proxyOp.creareCredit(Moneda.USD,50000);
        proxyOp.creareCredit(Moneda.RON,700000);
    }
}
