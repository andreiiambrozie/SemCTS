package clase.builder;

public class Rezervare {
    private int codRez;
    private boolean esteAsezareLaGeam;
    private boolean areScaunErgonomic;
    private boolean decorareMasa;
    private boolean muzicaAmbientalaPers;
    private String genMuzica;

    public Rezervare(int codRez, boolean esteAsezareLaGeam, boolean areScaunErgonomic, boolean decorareMasa, boolean muzicaAmbientalaPers, String genMuzica) {
        this.codRez = codRez;
        this.esteAsezareLaGeam = esteAsezareLaGeam;
        this.areScaunErgonomic = areScaunErgonomic;
        this.decorareMasa = decorareMasa;
        this.muzicaAmbientalaPers = muzicaAmbientalaPers;
        this.genMuzica = genMuzica;
    }


    protected void setEsteAsezareLaGeam(boolean esteAsezareLaGeam) {
        this.esteAsezareLaGeam = esteAsezareLaGeam;
    }

    protected void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    protected void setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
    }

    protected void setMuzicaAmbientalaPers(boolean muzicaAmbientalaPers) {
        this.muzicaAmbientalaPers = muzicaAmbientalaPers;
    }

    protected void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("codRez=").append(codRez);
        sb.append(", esteAsezareLaGeam=").append(esteAsezareLaGeam);
        sb.append(", areScaunErgonomic=").append(areScaunErgonomic);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", muzicaAmbientalaPers=").append(muzicaAmbientalaPers);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
