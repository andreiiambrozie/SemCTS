package ro.ase.acs.proxy;

public class ProxyOperatorCredite implements IOperatorCredite{
    OperatorCredite operatorCredite;

    public ProxyOperatorCredite(OperatorCredite operatorCredite) {
        this.operatorCredite = operatorCredite;
    }

    @Override
    public void creareCredit(Moneda moneda, int suma) {
        if(moneda==Moneda.RON){
            operatorCredite.creareCredit(moneda,suma);
        }else
            System.out.println("Banca acorda credit doar in RON");
    }
}
