import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Diseña un sistema de gestión de inventario para una tienda.
        // Crea una clase Producto con atributos como nombre, precio y cantidad en stock.
        // Permite al usuario agregar nuevos productos y modificar sus precios o cantidades.
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Lava Platos", 82378, 50));
        productos.add(new Producto("Auto de Juguete", 20321, 100));
        productos.add(new Producto("Cama", 15000, 20));
        productos.add(new Producto("Lava Ropas", 8000, 40));
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).toString());
        }
        System.out.println("Cuantos productos desea añadir: ");
        int cantidadDeProductosAañadir = sc.nextInt(); sc.nextLine();
        int contador = 0;
        do{
            System.out.println("Ingrese el nombre del producto: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el cantidad del producto: ");
            int cantidad = sc.nextInt(); sc.nextLine();
            System.out.println("Ingrese Precio del producto: ");
            double precio = sc.nextDouble(); sc.nextLine();
            productos.add(new Producto(nombre, precio, cantidad));
            contador++;
        }while(contador!=cantidadDeProductosAañadir);
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).toString());
        }
        System.out.println("Editar productos: ");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).toString());
            System.out.println("¿Desea editar el producto?: 1.Si 2.No ");
            int opcion = sc.nextInt(); sc.nextLine();
            if (opcion == 1) {
                System.out.println("Ingrese el nombre del producto: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el cantidad del producto: ");
                int cantidad = sc.nextInt();
                System.out.println("Ingrese Precio del producto: ");
                double precio = sc.nextDouble();
                productos.get(i).setNombre(nombre);
                productos.get(i).setCantidad(cantidad);
                productos.get(i).setPrecio(precio);
            }
        }
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).toString());
        }
    }
}
