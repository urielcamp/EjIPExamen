package ClasesYObjetos;

public class Vehiculo {

    //Ejercicio 2: Clase Vehículo
    //Crea una clase Vehiculo que represente un vehículo en una concesionaria.
    //Debe tener los siguientes atributos: marca, modelo y año de fabricación.
    //
    //Implementa tres constructores sobrecargados:
    //
    //Un constructor que tome la marca y el modelo.
    //Un constructor que tome la marca, el modelo y el año de fabricación.
    //Un constructor sin parámetros que inicialice la marca como "Marca desconocida",
    // el modelo como "Modelo desconocido", y el año de fabricación como 0.
    //Incluye métodos getter (getMarca(), getModelo(), getAnio()) para obtener los valores de los atributos.

    private String marca;

    private String modelo;

    private int anoFabricacion;

    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo(String marca, String modelo, int anoFabricacion){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacion = anoFabricacion;
    }

    public Vehiculo(){
        this.marca = "Marca desconocida";
        this.modelo = "Modelo desconocido";
        this.anoFabricacion = 0;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAnoFabricacion(){
        return anoFabricacion;
    }


}
