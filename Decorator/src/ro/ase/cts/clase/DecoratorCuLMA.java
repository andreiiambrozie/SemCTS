package ro.ase.cts.clase;

public class DecoratorCuLMA extends DecoratorAbstract {

    public DecoratorCuLMA(iNota nota) {
        super(nota);
    }

    //am adaugat functionalitate noua
    @Override
    public void printeazaFelicitare() {
        System.out.println(String.format("Felicitari: La multeani"));

    }

    //am modificat cv deja existent
    @Override
    public void printeazaNota() {
        super.printeazaNota();
        System.out.println("La multeani");
    }

}



