package ejemplonimina.modelo;

public class DetallePago {
private double isr;
private double cuotaIsste;
private double vale;
private double uMa;
private double primaVac;
private double pagoTotal;
Profesor profesor;

public DetallePago(Profesor p){
    profesor=p;
    uMa=117.86;
}
public DetallePago(Profesor p, double uma){
    profesor=p;
    uMa=uma;
}

public void calcularDeducciones(){
    System.out.println("En construccion calculo de decucciones....");
}
public void calcularPercepciones(){
     System.out.println("En construccion calculo de percepciones....");
}
public void calcularTotal(){
     System.out.println("En construccion calcular total....");
}
public double getIsr() {
    return isr;
}
public double getCuotaIsste() {
    return cuotaIsste;
}
public double getVale() {
    return vale;
}
public double getuMa() {
    return uMa;
}
public double getPrimaVac() {
    return primaVac;
}
public double getPagoTotal() {
    return pagoTotal;
}
public Profesor getProfesor() {
    return profesor;
}
public void setuMa(double uMa) {
    this.uMa = uMa;
}


}
