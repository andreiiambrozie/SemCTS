package clase.command;

import clase.Pacient;
import clase.factoryMethod.PersonalSpital;

public class Medic extends PersonalSpital {
    public Medic(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return "Medic "+super.getNume();
    }

    public static boolean verificaStare(Pacient pacient){
        if(pacient.getStareGrava()==true){
            return true;
        }else return false;
    }

    public void trateaza(){

        System.out.println(this.getNume()+ " Trateaza pacient");
    }

    public void interneaza()
    {
        System.out.println(this.getNume()+" Interneaza pacient");
    }
}
