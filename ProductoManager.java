import java.util.ArrayList;

public class ProductoManager {

    ArrayList<Producto> catalog = new ArrayList<>();

    public void addProducto(String nombre, double precio, int cantidadEnStock){
        Producto producto = new Producto(nombre, precio, cantidadEnStock);
        catalog.add(producto);
    }

    public int remProducto(int id){
        if (catalog.size() < 1) {
            System.out.println("Список продуктов ПУСТ.");
            return 0;
        }

        String prod = catalog.get(id - 1).nombre;
        catalog.remove(id - 1);

        System.out.println(prod + " Удален");
        return 1;
    }

    public void getProductos(){
        for (int i = 0; i < catalog.size(); i++) {
            int id = i + 1;    
            System.out.println("#" + id + " " + catalog.get(i));
        }
    }


    
}
