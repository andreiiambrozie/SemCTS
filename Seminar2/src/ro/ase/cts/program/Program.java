package ro.ase.cts.program;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.AngajatiReader;
import ro.ase.cts.clase.readers.iReader;

import javax.security.auth.callback.LanguageCallback;
import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	//functiile sunt statice, metodele NU
	public static List<Aplicant> citesteAplicanti(iReader readAplicant) throws FileNotFoundException {
		return readAplicant.readAplicants();
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti(new AngajatiReader("angajati.txt"));
			for(Aplicant angajat:listaAplicanti) {
				System.out.println(angajat.toString());
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
