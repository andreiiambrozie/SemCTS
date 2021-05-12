package clase.proxy;

import clase.Pacient;

public class ProxyInternare implements iOperatorInternare {
    private Pacient pacient;

    public ProxyInternare(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void internareCuAsigurare(Pacient pacient) {
        if(pacient.getAreAsigurare()==true)
            System.out.println("Are asiguare, se poate interna");
        else
            System.out.println("Nu are asiguare,nu se poate");
    }


}
