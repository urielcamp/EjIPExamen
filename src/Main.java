import ClasesYObjetos.Estudiante;
import ClasesYObjetos.PeliculaExamen;
import ClasesYObjetos.Vehiculo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 1");
        System.out.println(" ");

        PeliculaExamen p = new PeliculaExamen();

        System.out.println(p.getDirector() + p.getTitulo() + p.getMinutos());
        System.out.println(" ");

        PeliculaExamen pe = new PeliculaExamen("Scorssese", "El irlandes");

        System.out.println(pe.getDirector() + " " + pe.getTitulo() + pe.getMinutos());
        System.out.println(" ");

        PeliculaExamen pa = new PeliculaExamen("La odisea","Nolan", 220 );

        System.out.println(pa.getDirector() + " " + pa.getTitulo() + " " + pa.getMinutos());
        System.out.println(" ");


        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 2");
        System.out.println(" ");

        Vehiculo v = new Vehiculo();

        System.out.println(v.getMarca() + " " + v.getModelo() + " " + v.getAnoFabricacion());
        System.out.println(" ");

        Vehiculo va = new Vehiculo("Ford", "Mustang");

        System.out.println(va.getMarca() + " " + va.getModelo() + " " + va.getAnoFabricacion());
        System.out.println(" ");

        Vehiculo vc = new Vehiculo("Nissan", "sentra", 2015);


        System.out.println(vc.getMarca() + " " + vc.getModelo() + " " + vc.getAnoFabricacion());
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 3");
        System.out.println(" ");

        Estudiante e = new Estudiante();

        System.out.println(e.getNombre() + " " + e.getCarrera() + " " + e.getAnoIngreso());
        System.out.println();

        Estudiante ea = new Estudiante("Jose", "Medicina");

        System.out.println(ea.getNombre() + " " + ea.getCarrera() + " " + ea.getAnoIngreso());
        System.out.println();

        Estudiante ec = new Estudiante("Clara", "Ingenieria", 2022);

        System.out.println(ec.getNombre() + " " + ec.getCarrera() + " " + ec.getAnoIngreso());
        System.out.println();

        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ejercicio 4");
        System.out.println(" ");





    }
}