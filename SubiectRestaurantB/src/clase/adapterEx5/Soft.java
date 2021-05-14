package clase.adapterEx5;

public class Soft {

    private Factura factura;

    public Soft(Factura factura) {
        this.factura = factura;
    }

    public void printare(){
        System.out.println("Printare prin soft vechi, factura in val de: "+this.factura.getSuma());
    }
}
