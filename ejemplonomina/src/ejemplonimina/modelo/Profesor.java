package ejemplonimina.modelo;



public class Profesor {

public String nombre;
private int numEmpleado;
private int antiguedad;
private double salarioBase;
private String tipo;

public Profesor(){}

public Profesor(int ne){
    numEmpleado=ne;
    salarioBase=1000;
}

public Profesor(String nombre, int ne){
    this.nombre=nombre;
    numEmpleado=ne;
    salarioBase=1000;
}

public int getNumEmpleado() {
    return numEmpleado;
}

public int getAntiguedad() {
    return this.antiguedad;
}

public void setAntiguedad(int antiguedad){
   this.antiguedad=antiguedad; 
}

public double getSalarioBase() {
    return salarioBase;
}

public void setSalarioBase(double salarioBase) {
    this.salarioBase = salarioBase;
}

public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

@Override
public String toString() {
    return "Profesor [nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", antiguedad=" + antiguedad
            + ", salarioBase=" + salarioBase + ", tipo=" + tipo + "]";
}



}
