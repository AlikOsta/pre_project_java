import java.util.ArrayList;

public class main {
    public static void main(String[] args){

        ProductoManager manager = new ProductoManager();
        manager.addProducto("te", 10.0,  0);
        manager.addProducto("te1", 10.0,  50);
        manager.addProducto("te2", 10.0,  60);
        manager.getProductos();

        manager.remProducto(1);

        manager.getProductos();


    }
    
}
