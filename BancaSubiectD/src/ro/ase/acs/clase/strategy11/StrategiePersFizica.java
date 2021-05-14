package ro.ase.acs.clase.strategy11;

public class StrategiePersFizica implements iStrategy {
    @Override
    public void prezintaDocumente() {
        System.out.println("Prezinta buletin");
        System.out.println("Prezinta adeverinta de munca");
    }
}
