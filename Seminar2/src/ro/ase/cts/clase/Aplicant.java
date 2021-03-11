package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nr_proiecte;

	private static int pragPunctaj=80;


	protected String[] denumiriProiect;

	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void statut(){
		if(punctaj>pragPunctaj)
			System.out.println("Aplicantul "+nume+" "+prenume+" a fost acceptat.");
		else
			System.out.println("Aplicantul "+nume+" "+prenume+" nu a fost acceptat.");
		}
	public int getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}


	public String[] getDenumiriProiect() {
		return denumiriProiect;
	}

	public void setDenumiriProiect(String[] denumiriProiect) {
		this.denumiriProiect = denumiriProiect;
	}

	public void setVectorDenumiri(String[] denumiriProiect, int nr_proiecte){
		this.nr_proiecte=nr_proiecte;
		this.denumiriProiect=denumiriProiect;
	}

	
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumiriProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nr_proiecte = nr_proiecte;
		this.denumiriProiect = denumiriProiect;
	}
	public int getNr_proiecte() {
		return nr_proiecte;
	}
	public void setNr_proiecte(int nr_proiecte) {
		this.nr_proiecte = nr_proiecte;
	}

	abstract public float getSumaFinantata();

	public void afisareRaspunsProiect(Proiect proiect) {

		boolean esteAcceptat=punctaj>=proiect.getPragDeAcceptare();

		StringBuilder stringBuilder=new StringBuilder("Aplicantul ")
				.append(" ").append(nume)
				.append(" ").append(prenume).append(" ");

		stringBuilder.append(esteAcceptat?"a fost acceptat ":" a fost respins");
		System.out.println(stringBuilder.toString());
	}

	@Override
	public String toString() {

			final StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("nume='").append(nume).append('\'');
			stringBuilder.append(", prenume='").append(prenume).append('\'');
			stringBuilder.append(", varsta=").append(varsta);
			stringBuilder.append(", punctaj=").append(punctaj);
			stringBuilder.append(", nr_proiecte=").append(nr_proiecte);
			stringBuilder.append(", denumiriProiecte=").append(Arrays.toString(denumiriProiect));
			return stringBuilder.toString();

	}
}
