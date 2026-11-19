import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Producto> productos = new HashSet<>();

        productos.add(new Producto("P001", "Teclado mecánico"));
        productos.add(new Producto("P002", "Mouse inalámbrico"));
        productos.add(new Producto("P003", "Monitor 24 pulgadas"));

        productos.add(new Producto("P001", "Teclado mecánico versión duplicada"));

        System.out.println("Productos únicos en el HashSet:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
