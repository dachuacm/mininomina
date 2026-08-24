package mominaoo.modelo;

public class Profesor {
private String nombre;

public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getNombre() {
    return nombre;
}
@Override
public String toString() {
    return "Profesor [nombre=" + nombre + "]";
}

}
