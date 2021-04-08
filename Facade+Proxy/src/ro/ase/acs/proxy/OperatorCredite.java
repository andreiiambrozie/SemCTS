package ro.ase.acs.proxy;

public class OperatorCredite implements IOperatorCredite{
    @Override
    public void creareCredit(Moneda moneda, int suma) {
        System.out.println("A fost realizat creditul " +
                "in valoare de "+suma+moneda);
    }
}
