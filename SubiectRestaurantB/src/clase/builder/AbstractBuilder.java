package clase.builder;

public abstract class AbstractBuilder {
    public abstract Rezervare build();
    public abstract AbstractBuilder setCodRez(int codRez);
    public abstract AbstractBuilder setAsezareGeam(boolean areAsezareGeam);
    public abstract AbstractBuilder setScaunErgonomic(boolean areScaunErgonomic);
    public abstract AbstractBuilder setDecorareMasa(boolean decorareMasa);
    public abstract AbstractBuilder areMuzicaAmbPers(boolean areMuzicaAmbPers);
    public abstract AbstractBuilder setGenMuzica(String genMuzica);
}
