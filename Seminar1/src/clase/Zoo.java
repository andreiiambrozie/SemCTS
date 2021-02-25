package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements ZooInterface{
	
	private Zookeeper zookeeper;
	private List<Animal> animalList;
	
	
	public Zoo(Zookeeper zookeeper, List<Animal> animalList) {
		super();
		this.zookeeper = zookeeper;
		this.animalList = animalList;
	}
	
	public Zoo() {
		animalList=new ArrayList<>();
		zookeeper=new Zookeeper("Ion");
	}


	public Zookeeper getZookeeper() {
		return zookeeper;
	}


	public void setZookeeper(Zookeeper zookeeper) {
		this.zookeeper = zookeeper;
	}


	public List<Animal> getAnimalList() {
		return animalList;
	}


	public void setAnimalList(List<Animal> animalList) {
		this.animalList = animalList;
	}
	
	
	public void addAnimal(Animal animal) {
		
		animalList.add(animal);
	}

	public void feedAllAnimals() {
		for(Animal animal:animalList) {
			zookeeper.feed(animal);
		}
	}
}
