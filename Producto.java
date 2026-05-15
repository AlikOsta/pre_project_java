
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
        return "Nombre: " + nombre + ", Precio: " + precio + " ARS., Cantidad en stock: " + cantidadEnStock;
    }
}




