package ro.ase.cts.program;

import ro.ase.cts.clase.*;
import ro.ase.cts.clase.readers.AngajatiReader;
import ro.ase.cts.clase.readers.iReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {
	//functiile sunt statice, metodele NU
	public static List<Aplicant> citesteAplicanti(iReader readAplicant) throws FileNotFoundException {
		return readAplicant.readAplicants();
	}

	public static void main(String[] args) {
		System.out.println("Suma finantata pentru angajati: "+Angajat.getSumaFinantare());
		System.out.println("Suma finanatata pentru elevi: "+ Elev.getSumaFinantare());
		System.out.println("Suma finantata pentru studenti: "+ Student.getSumaFinantare());
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti(new AngajatiReader("angajati.txt"));
			Proiect proiect=new Proiect(81);
			for(Aplicant aplicant:listaAplicanti) {
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getSumaFinantata());

				aplicant.afisareRaspunsProiect(proiect);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
