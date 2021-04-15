package ro.ase.cts.main;

import ro.ase.cts.clase.DecoratorAbstract;
import ro.ase.cts.clase.DecoratorCuLMA;
import ro.ase.cts.clase.DecoratorCuPasteFericit;
import ro.ase.cts.clase.NotaDePlata;

public class Main {
    public static void main(String[] args) {
        NotaDePlata notaInitial=new NotaDePlata(120);
        notaInitial.printeazaNota();

        DecoratorAbstract decoratorCuLMA=new DecoratorCuLMA(notaInitial);

        //printez felicitarea
        decoratorCuLMA.printeazaFelicitare();
        System.out.println();
        //noua nota va avea si mesajul printat
        //prin decorare
        decoratorCuLMA.printeazaNota();


        DecoratorAbstract decoratorPaste=new DecoratorCuPasteFericit(notaInitial);
        decoratorPaste.printeazaNota();
        System.out.println();
        decoratorPaste.printeazaFelicitare();
        System.out.println();

        NotaDePlata notaDePlata=new NotaDePlata(78);
        DecoratorAbstract decoratorLMA2=new DecoratorCuLMA(notaDePlata);
        DecoratorAbstract decoratorPaste2=new DecoratorCuPasteFericit(decoratorLMA2);
        decoratorPaste2.printeazaNota();
    }
}
