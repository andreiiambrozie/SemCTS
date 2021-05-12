package clase.proxy;

import clase.Pacient;

public class OperatorInternare implements iOperatorInternare {
    @Override
    public void internareCuAsigurare(Pacient pacient) {
        System.out.println("S a efectuat internarea");
    }
}
