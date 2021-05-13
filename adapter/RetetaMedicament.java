package clase.adapter;

public class RetetaMedicament {
    int cod;
    boolean esteValabila;

    public RetetaMedicament(int cod, boolean esteValabila) {
        this.cod = cod;
        this.esteValabila = esteValabila;
    }

    public int getCod() {
        return cod;
    }

    public boolean isEsteValabila() {
        return esteValabila;
    }
}
