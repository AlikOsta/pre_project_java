
import java.util.Scanner;

public class main {
    public static void main(String[] args){

        ProductoManager manager = new ProductoManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Añadir un producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Mostrar todos los productos");
            System.out.println("4. Salir");
            System.out.print("Selecciona un artículo: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ВIntroduce el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduce el precio del artículo: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Introduzca la cantidad de producto en stock: ");
                    int cantidadEnStock = scanner.nextInt();
                    manager.addProducto(nombre, precio, cantidadEnStock);
                    break;
                case 2:
                    System.out.print("Introduce el número de artículo para eliminar: ");
                    int numProdDel = scanner.nextInt();
                    manager.remProducto(numProdDel);
                    break;
                case 3:
                    manager.getProductos();
                    break;
                case 4:
                    System.out.println("Dejar el programa.");
                    return;
                default:
                    System.out.println("Elemento de menú inválido.");
            }
        }
    }
}
