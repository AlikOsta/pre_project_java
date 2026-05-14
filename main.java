
import java.util.Scanner;

public class main {
    public static void main(String[] args){

        ProductoManager manager = new ProductoManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Меню ---");
            System.out.println("1. Добавить товар");
            System.out.println("2. Удалить товар");
            System.out.println("3. Показать все товары");
            System.out.println("4. Выход");
            System.out.print("Выберите пункт: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите название товара: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Введите цену товара: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Введите количество товара на складе: ");
                    int cantidadEnStock = scanner.nextInt();
                    manager.addProducto(nombre, precio, cantidadEnStock);
                    break;
                case 2:
                    System.out.print("Введите номер товара для удаления: ");
                    int numProdDel = scanner.nextInt();
                    manager.remProducto(numProdDel);
                    break;
                case 3:
                    manager.getProductos();
                    break;
                case 4:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неверный пункт меню.");
            }
        }
    }
}
