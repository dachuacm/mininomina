package ejemplonimina;

import ejemplonimina.modelo.Profesor;

//import ejemplonimina.modelo.Profesor;

public class App {
    public static void main(String[] args) throws Exception {
          Profesor profe=new Profesor();
          Profesor profe1=new Profesor(32);
          Profesor profe2=new Profesor("Panchito",458);
        
          profe.nombre="Lalo";
          profe.setAntiguedad(8);
          
          System.out.println("resultado:");

        System.out.println(profe);
    }
}
