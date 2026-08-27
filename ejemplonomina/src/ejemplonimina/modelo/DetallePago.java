package ejemplonimina.modelo;

public class DetallePago {
private double isr;
private double cuotaIsste;
private double vale;
private double uMa;
private double primaAnt;

Profesor profesor;

public DetallePago(Profesor p){
    profesor=p;
    uMa=117.86;
}
public DetallePago(Profesor p, double uma){
    profesor=p;
    uMa=uma;
}

public double calcularDeducciones(){
    System.out.println("En construccion calculo de decucciones....\ndatos de prueba");
    isr=73.5;
    cuotaIsste=263.8;
    return isr+cuotaIsste;
}
public double calcularPercepciones(){
     System.out.println("En construccion calculo de percepciones....\ndatos de prueba");
    vale=300.58;
    primaAnt=135.47;
    return vale+primaAnt;
    }

public double calcularTotal(){
     System.out.println("En construccion calcular total....");
       double percepciones= profesor.getSalarioBase()+ calcularPercepciones();  
       double deducciones= calcularDeducciones();  
     return percepciones-deducciones;
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
public double getPrimaAnt() {
    return primaAnt;
}
public Profesor getProfesor() {
    return profesor;
}
public void setuMa(double uMa) {
    this.uMa = uMa;
}

public String imprimeDeducciones(){
       return "Deducciones:\n"+"ISR: "+isr +"\n"+
              "ISSSTE: "+cuotaIsste +"\n"+
              "Total dedicciones: "+(isr +cuotaIsste)+"\n";
}
public String imprimePercepciones(){
       return "Percepciones:\n"+"salario: "+profesor.getSalarioBase() +"\n"+
              "vale despensa: "+vale+"\n"+
              "Total percepciones: "+(vale +profesor.getSalarioBase()+ primaAnt)+"\n";
}
@Override
public String toString() {
    return "DetallePago [isr=" + isr + ", cuotaIsste=" + cuotaIsste + ", vale=" + vale + ",", primaVac="
            + primaVac + ", profesor=\n" + profesor + "]";
}


}
