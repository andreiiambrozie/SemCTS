package clase.facade;

public class Pat {

    private boolean ocupat;
    private String numePacient;

    public void setOcupat(boolean ocupat) {
        this.ocupat = ocupat;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public Pat(boolean ocupat) {
        this.ocupat = ocupat;
    }

    public boolean isOcupat(){
        return ocupat;
    }
}
