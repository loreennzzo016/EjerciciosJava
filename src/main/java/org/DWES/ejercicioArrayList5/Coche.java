package org.DWES.ejercicioArrayList5;

public class Coche implements Comparable<Coche> {
    private String marca;
    private double precio;

    public Coche(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return marca + " - " + precio + "€";
    }

    @Override
    public int compareTo(Coche o) {
        return Double.compare(this.precio, o.precio);
    }
}
