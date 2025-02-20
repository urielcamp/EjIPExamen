package ClasesYObjetos;

public class CuentaBancaria {
    //Crea una clase CuentaBancaria con los atributos titular, saldo y tipo de cuenta.
    //Implementa un método que calcule los intereses anuales según el tipo de cuenta
    //(por ejemplo, cuenta de ahorros tiene un 5%, cuenta corriente un 2%, etc.).
    //Luego, crea una subclase CuentaDeInversion que sobrescriba el método para aplicar un interés del 10%.

    private String titular;
    private String tipoCuenta;
    private int saldo;

    public CuentaBancaria(String titular, String tipoCuenta, int saldo){
        this.titular = titular;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    public double interesAnual(){
        return 0.0;
    }

    public String getTitular(){
        return titular;
    }

    public String getTipoCuenta(){
        return tipoCuenta;
    }

    public int getSaldo(){
        return saldo;
    }

}
