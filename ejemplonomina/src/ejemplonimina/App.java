package ejemplonimina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejemplonimina.modelo.DetallePago;
import ejemplonimina.modelo.Profesor;
import ejemplonimina.modelo.Recibo;

//import ejemplonimina.modelo.Profesor;

public class App {
    public static void main(String[] args) throws Exception {
        List<Recibo> nomina=new ArrayList<Recibo>(); 
        List<Profesor> profesores=new ArrayList<Profesor>();
        Scanner sc=new Scanner(System.in);
        int r=1; //r=1 continua si r=0 sale        
        
        while(r==1){
      
            Profesor p;

            System.out.println("Ingresa el los datos del profesor:");
             
             System.out.println("número_empleado:");
             int ne=sc.nextInt();
             p=new Profesor(ne);
             System.out.println("nombre:");
             p.nombre=sc.next();
             System.out.println("antigüedad:");
             p.setAntiguedad(sc.nextInt());
             System.out.println("salario base:");
             p.setSalarioBase(sc.nextDouble());
             
            profesores.add(p);

            System.out.println("Deseas dar de alta a otro profesor 1)si 2)no");
            r=sc.nextInt();

        }
 System.out.println("Nomina quicenal");
        for(Profesor p:profesores){
           DetallePago detalle=new DetallePago(p);
           Recibo recibo=new Recibo(detalle);            
           nomina.add(recibo);
           System.out.println(recibo);
        }

        
    }//main
}//App
