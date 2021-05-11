package clase.factoryMethod;

import clase.builder.Pacient;

public class Medic extends PersonalSpital {
    public Medic(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return "Medic "+super.getNume();
    }

    public static boolean verificaStare(Pacient pacient){
        if(pacient.isStareGrava()==true){
            return true;
        }else return false;
    }
}
