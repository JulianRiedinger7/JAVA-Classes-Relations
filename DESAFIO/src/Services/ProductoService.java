package Services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Entities.Producto;

public class ProductoService {
    private final Scanner input = new Scanner(System.in);
    static List<Producto> productos = new ArrayList<>();
    private static Integer cont = 0;

    public Producto crearProducto() {
        Producto p = new Producto();

        System.out.println("Ingrese el nombre del producto");
        p.setNombre(input.nextLine());

        System.out.println("Ingrese el precio del producto");
        p.setPrecio(Double.parseDouble(input.nextLine()));

        p.setId(cont);
        cont += 1;

        productos.add(p);

        return p;
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void modificarProducto() {
        mostrarProductos();
        System.out.println("Ingrese el ID del producto a modificar");
        int idUsuario = Integer.parseInt(input.nextLine());

        if (idUsuario < 0 || idUsuario > productos.size() - 1) {
            System.out.println("Producto " + idUsuario + " no se encuentra en la lista");
        } else {

            if (productos.get(idUsuario) == null) {
                System.out.println("Producto " + idUsuario + " esta eliminado");
            } else {
                for (Producto producto : productos) {
                    if (idUsuario == producto.getId()) {
                        System.out.println("Ingrese el nuevo nombre del producto");
                        producto.setNombre(input.nextLine());

                        System.out.println("Ingrese el nuevo precio del producto");
                        producto.setPrecio(Double.parseDouble(input.nextLine()));
                    }
                }
            }

        }

    }

    public void eliminarProducto() {
        mostrarProductos();
        System.out.println("Ingrese el ID del producto a modificar");
        int idUsuario = Integer.parseInt(input.nextLine());

        if (idUsuario < 0 || idUsuario > productos.size() - 1) {
            System.out.println("Producto " + idUsuario + " no se encuentra en la lista");
        } else {

            if (productos.get(idUsuario) == null) {
                System.out.println("Producto " + idUsuario + " esta eliminado");
            } else {

                Iterator<Producto> it = productos.iterator();

                while (it.hasNext()) {
                    Producto producto = it.next();

                    if (producto.getId() == idUsuario) {
                        it.remove();
                        System.out.println("Producto " + idUsuario + " eliminado");
                        break;
                    }
                }
            }
        }

    }

}
