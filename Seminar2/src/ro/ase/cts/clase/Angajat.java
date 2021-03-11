package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static int sumaFinantare=10;

	public float getSumaFinantata() {
		return sumaFinantare;
	}

	public static int getSumaFinantare() {
		return sumaFinantare;
	}

	public static void setSumaFinantare(int sumaFinantare) {
		Angajat.sumaFinantare = sumaFinantare;
	}

	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public int getSalariu() {
		return salariu;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();
	}
	
	
	@Override
	public String toString() {

		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append("Student: ").append(super.toString()).append("Salariu: ").append(salariu)
				.append("Ocupatie: ").append(ocupatie);

		return stringBuilder.toString();
	}
}
