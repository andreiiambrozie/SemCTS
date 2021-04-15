package ro.ase.cts.clase;

public abstract class DecoratorAbstract implements iNota {
    private iNota nota;

    public DecoratorAbstract(iNota nota) {
        this.nota = nota;
    }

    //printeaza la fel ca pt nota initiala
    @Override
    public void printeazaNota() {
        nota.printeazaNota();
    }

    //noua functionalitate
    public abstract void printeazaFelicitare();
}
