package embarcaciones;

public class Velero extends Embarcacion {
    private int cantidadMastiles;

    // constructor

    public Velero(double precioBase, int anioFabricacion, double eslora, int cantidadMastiles) {
        super(precioBase, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    // getters & setters

    public int getCantidadMastiles() {
        return cantidadMastiles;
    }

    public void setCantidadMastiles(int cantidadMastiles) {
        this.cantidadMastiles = cantidadMastiles;
    }

    // abstract methods
    @Override
    public double calcularMontoAlquiler() {
        if(getAnioFabricacion() > 2020){
            return getPrecioBase() + getValorAdicional();
        }
        return getPrecioBase();
    }

    // custom methods
    public boolean esGrande(){
        return cantidadMastiles > 4;
    }


}
