package ro.ase.acs.clase.strategy11;

public class StrategyPersJuridica implements iStrategy{

    @Override
    public void prezintaDocumente() {
        System.out.println("Prezinta act de infiintare");
        System.out.println("Prezinta dovada inreg la RC");
    }
}
