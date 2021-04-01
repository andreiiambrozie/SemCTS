package ro.ase.cts.clase;

public class BiletAdapterClasa extends Bilet implements iBiletOnline{
    public BiletAdapterClasa(float pret) {
        super(pret);
    }

    @Override
    public void vindeBiletOnline() {
        super.vanzare();
    }

    @Override
    public void rezervaBiletOnline() {
        super.rezervare();
    }
}
