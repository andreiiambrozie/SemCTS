package clase.simpleFactory;

import clase.factoryMethod.Asistent;
import clase.factoryMethod.Brancardier;
import clase.factoryMethod.Medic;
import clase.factoryMethod.PersonalSpital;

public class SimpleFactory {
    public PersonalSpital crearePersonal(TipPersonal tip, String nume){
        switch (tip){
            case Brancardier:return new Brancardier(nume);
            case Medic:return new Medic(nume);
            case Asistent:return new Asistent(nume);
            default:throw new IllegalArgumentException();
        }
    }
}
