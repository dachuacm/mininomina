package ejemplonimina.modelo;

public class Recibo {
private DetallePago detalle;
private double totalPago;

public Recibo(DetallePago detalle){
    this.detalle=detalle;
    totalPago=detalle.calcularTotal();
}

@Override
public String toString() {
    return "Recibo nomina\n"+
          "nombre:" +detalle.getProfesor().nombre + 
          "\tnumero empleado:" + detalle.getProfesor().getNumEmpleado()+
          "\tantigüedad:" + detalle.getProfesor().getAntiguedad()+
          "\n"+detalle.imprimeDeducciones()+
          "\n"+detalle.imprimePercepciones() +
           "\nTotal a pagar: "+ totalPago;
}



}
