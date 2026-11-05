package Taller;


import java.util.Arrays;
import java.util.List;

public class ProductoApp {

    static class Producto {
        String nombre;
        String categoria;
        double precio;
        int stock;

        Producto(String nombre, String categoria,
                 double precio, int stock) {
            this.nombre = nombre;
            this.categoria = categoria;
            this.precio = precio;
            this.stock = stock;
        }
    }

    public static void main(String[] args) {

        List<Producto> productos = Arrays.asList(
            new Producto("Laptop", "Tecnología", 800, 5),
            new Producto("Mouse", "Tecnología", 15, 20),
            new Producto("Teclado", "Tecnología", 30, 12),
            new Producto("Silla", "Muebles", 120, 8),
            new Producto("Mesa", "Muebles", 200, 4),
            new Producto("Cuaderno", "Papelería", 3, 50),
            new Producto("Lápiz", "Papelería", 1, 100),
            new Producto("Mochila", "Accesorios", 25, 15),
            new Producto("Audífonos", "Tecnología", 45, 10),
            new Producto("Lámpara", "Hogar", 35, 7)
        );

      
       // 1. Selección
        System.out.println("Productos con precio mayor a $30:");
        productos.stream()
            .filter(p -> p.precio > 30)
            .forEach(p -> System.out.println(p.nombre));

        // 2. Transformación
        System.out.println("\nNombres de los productos:");
        productos.stream()
            .map(p -> p.nombre)
            .forEach(System.out::println);

        // 3. Validación
        boolean sinStock = productos.stream()
            .anyMatch(p -> p.stock == 0);

        System.out.println("\n¿Existe algún producto sin stock?");
        System.out.println(sinStock);

        // 4. Conteo
        long cantidad = productos.stream()
            .filter(p -> p.precio > 30)
            .count();

        System.out.println("\nCantidad de productos con precio mayor a $30:");
        System.out.println(cantidad);
    }
}
