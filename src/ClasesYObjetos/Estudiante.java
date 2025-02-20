package ClasesYObjetos;

public class Estudiante {
    //Crea una clase Estudiante que represente a un estudiante de una escuela o universidad.
    //Debe tener los siguientes atributos: nombre, carrera y año de ingreso.
    //
    //Implementa tres constructores sobrecargados:
    //
    //Un constructor que tome el nombre y la carrera.
    //Un constructor que tome el nombre, la carrera y el año de ingreso.
    //Un constructor sin parámetros que inicialice el nombre como "Nombre desconocido",
    // la carrera como "Carrera desconocida", y el año de ingreso como 0.
    //Incluye métodos getter (getNombre(), getCarrera(),
    //getAnioIngreso()) para obtener los valores de los atributos.

    private String nombre;
    private String carrera;
    private int anoIngreso;

    public Estudiante(String nombre, String carrera){
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public Estudiante(String nombre, String carrera, int anoIngreso){
        this.nombre = nombre;
        this.carrera = carrera;
        this.anoIngreso = anoIngreso;
    }

    public Estudiante(){
        this.nombre = "Nombre desconocido";
        this.carrera = "Carrera desconocida";
        this.anoIngreso = 0;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCarrera(){
        return carrera;
    }

    public int getAnoIngreso(){
        return anoIngreso;
    }
}
