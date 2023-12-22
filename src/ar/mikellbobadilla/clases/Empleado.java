package ar.mikellbobadilla.clases;

import java.util.Objects;

public class Empleado implements Comparable<Empleado> {
    private int id;
    private String nombre;
    private String puesto;
    private String despacho;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String puesto, String despacho) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.despacho = despacho;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", despacho='" + despacho + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return id == empleado.id && Objects.equals(nombre, empleado.nombre) && Objects.equals(puesto, empleado.puesto) && Objects.equals(despacho, empleado.despacho);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, puesto, despacho);
    }

    @Override
    public int compareTo(Empleado o) {
        return Integer.compare(id, o.getId());
    }
}
