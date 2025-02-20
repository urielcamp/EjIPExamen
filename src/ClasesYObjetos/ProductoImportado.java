package ClasesYObjetos;

public class ProductoImportado extends Producto{

    private int impuesto;

    public ProductoImportado(int impuesto, String nombre, int precio, int stock){
        super(nombre, precio, stock);
        this.impuesto = impuesto;
    }


    @Override
    public int ValorTotal(){
        return (getPrecio() * getStock()) + impuesto;
    }


}
