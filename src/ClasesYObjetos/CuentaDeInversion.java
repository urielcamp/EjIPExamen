package ClasesYObjetos;

public class CuentaDeInversion extends CuentaBancaria{

    public CuentaDeInversion(String titulo, String tipoCuenta, int saldo){
        super(titulo, tipoCuenta, saldo);
    }

    @Override
    public double interesAnual(){
        return getSaldo() * 0.1;
    }
}
