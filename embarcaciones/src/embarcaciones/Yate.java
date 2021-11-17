package embarcaciones;

public class Yate extends Embarcacion {
    private int cantidadCamarotes;

    // constructor
    public Yate(double precioBase, int anioFabricacion, double eslora, int cantidadCamarotes) {
        super(precioBase, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    // getters & setters

    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public void setCantidadCamarotes(int cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }

    // abstract method

    @Override
    public double calcularMontoAlquiler() {
        if(getAnioFabricacion() > 2020){
            return getPrecioBase() + getValorAdicional();
        }
        return getPrecioBase();
    }

    // Custom methods
    public boolean esMasLujoso(Yate otroYate){
        if(getCantidadCamarotes() > otroYate.getCantidadCamarotes()){
            return  true;
        }
        return false;
    }
}
