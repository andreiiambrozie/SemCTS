package clase.state;

import clase.Pacient;

public class StareSubObsv implements Stare {
    @Override
    public void modificaStare(Pacient pacient) {
        if(pacient.getStare() instanceof StareSubObsv){
            System.out.println("Nu poti tine sub obsv cv deja sub obsv");
        }else{
            if(pacient.getStareGrava()==true){
                pacient.setStare(this);
                System.out.println("Pacientul "+pacient.getNume()+
                        " este sub obsv ");
            }else
                System.out.println("Nu putem tine sub obsv cv ce nu e grav");
        }
    }
}
