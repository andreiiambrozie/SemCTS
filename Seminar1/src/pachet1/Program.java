package pachet1;

import clase.Girafa;
import clase.Zebra;
import clase.Zoo;

public class Program {
	public static void main(String [] args) {
		
		Zoo zoo=new Zoo();
		
		Girafa g1=new Girafa("Claus");
		Girafa g2=new Girafa("Nutu");
		
		zoo.addAnimal(g1);
		zoo.addAnimal(g2);
		
		Zebra z1=new Zebra("Cl");
		Zebra z2=new Zebra("n1");
		zoo.addAnimal(z1);
		zoo.addAnimal(z2);
		
		
		zoo.feedAllAnimals();
		
	}
}
