package clase;

public class Zookeeper {

	
	private String nume;


	public Zookeeper(String nume2) {
		this.nume=nume2;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	void feed(Animal animal) {
		System.out.println(nume+" hraneste aninmalul: "+animal.getName());
		
		
	}
}
