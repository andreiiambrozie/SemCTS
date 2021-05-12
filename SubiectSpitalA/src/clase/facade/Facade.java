package clase.facade;

import clase.Pacient;
import clase.command.Medic;

public class Facade {

  public static boolean internarePacient(Pacient pacient){
      if(Medic.verificaStare(pacient) && Salon.verificaPat(pacient)){
          return true;
      }else return false;
  }
}
