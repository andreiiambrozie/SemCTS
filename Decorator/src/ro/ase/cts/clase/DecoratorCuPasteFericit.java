package ro.ase.cts.clase;

public class DecoratorCuPasteFericit extends DecoratorAbstract {
    public DecoratorCuPasteFericit(iNota nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println(String.format("Felicitari: Paste fericit!"));
    }

    @Override
    public void printeazaNota() {
        super.printeazaNota();
        System.out.println("Paste fericit");
    }

}
