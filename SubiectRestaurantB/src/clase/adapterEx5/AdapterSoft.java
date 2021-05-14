package clase.adapterEx5;

public class AdapterSoft implements SoftNou {

    private Soft soft;

    public AdapterSoft(Soft soft) {
        this.soft = soft;
    }

    @Override
    public void printeazaSoftNou() {
        this.soft.printare();
    }
}
