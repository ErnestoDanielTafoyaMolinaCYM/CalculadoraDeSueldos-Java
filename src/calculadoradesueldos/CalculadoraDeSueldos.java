package calculadoradesueldos;

import Strategy.CajeroStrategy;
import Strategy.RepositorStrategy;
import Strategy.SalaryStrategy;
import Strategy.Strategy;
import Strategy.SupervisorStrategy;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculadoraDeSueldos {

    public static void main(String[] args) {
        /*
        TODO:
            En el siguiente programa haremos el calculo de sueldos en tres categorias con el patron de diseño strategy
            1.- Repositor: Cobra 15,890 + bono de 10%
            2.- Cajero: Cobra 25,630.89 fijos
            3.- Supervisor: Cobra  35,560.20 en bruto pues se le descuenta el 11% de jubilación.
        */ 
        
        Strategy repositor = new RepositorStrategy(15890);
        Strategy cajero = new CajeroStrategy(25630.89);
        Strategy supervisor = new SupervisorStrategy(35560.20);
        /*
        Strategy repositor = new SalaryStrategy(15890, .10);
        Strategy cajero = new SalaryStrategy(25630.80, 0);
        Strategy supervisor = new SalaryStrategy(35560.20, -.11);
        */
        
        List<Strategy> estrategias = new ArrayList<>();
        estrategias.add(repositor);
        estrategias.add(cajero);
        estrategias.add(supervisor);
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Seleccione el tipo de empleado: "); 
        System.out.println("1.- repositor");
        System.out.println("2.- cajero");
        System.out.println("3.- supervisor");
        int eleccion = scan.nextInt() - 1;
        while(eleccion < 0 || eleccion > estrategias.size()){
            System.out.println("Eleccion no valida, intentelo de nuevo: ");
            eleccion = scan.nextInt() -1;
        }
        Strategy elegida = estrategias.get(eleccion);
        System.out.println("El salario es: "+ elegida.calculateSalary());
                
                
    }
    
}
