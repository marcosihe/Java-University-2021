package embarcaciones;

import tripulantes.Capitan;

public abstract class Embarcacion {
    private double precioBase;
    private double valorAdicional;
    private int anioFabricacion;
    private double eslora;
    private Capitan capitanAsociado;

    // constructor

    public Embarcacion(double precioBase, int anioFabricacion, double eslora) {
        this.precioBase = precioBase;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    // getters & setters

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public Capitan getCapitanAsociado() {
        return capitanAsociado;
    }

    public void setCapitanAsociado(Capitan capitanAsociado) {
        this.capitanAsociado = capitanAsociado;
    }

    // custom methods
    public abstract double calcularMontoAlquiler();
}
