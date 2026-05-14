
public class Producto {
    String nombre;
    double precio;
    int cantidadEnStock;

    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidad;
    }
    
    @Override
    public String toString() {
        return "Товар: " + nombre + ", Цена: " + precio + " руб., Остаток: " + cantidadEnStock;
    }
}




