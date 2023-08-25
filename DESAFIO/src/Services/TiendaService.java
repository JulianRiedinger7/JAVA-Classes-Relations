package Services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Entities.Producto;
import Entities.Tienda;

public class TiendaService {
    private final Scanner input = new Scanner(System.in);
    private static List<Tienda> tiendas = new ArrayList<>();
    private static Integer cont = 0;
    private static final ProductoService ps = new ProductoService();

    public Tienda crearTienda() {
        Tienda t = new Tienda();

        System.out.println("Ingrese la direccion de la tienda");
        t.setDireccion(input.nextLine());

        System.out.println("Ingrese el representante de la tienda");
        t.setRepresentante(input.nextLine());

        t.setId(cont);
        cont += 1;

        tiendas.add(t);
        return t;
    }

    public void mostrarTiendas() {
        for (Tienda tienda : tiendas) {
            System.out.println(tienda);
        }
    }

    public void mostrarProductosTienda(Tienda t) {
        for (Map.Entry<Producto, Integer> entry : t.getProductosTienda().entrySet()) {
            Producto p = entry.getKey();
            Integer stock = entry.getValue();

            System.out.println("Producto: " + p + " Stock: " + stock);
        }
    }

    public void modificarTienda() {
        mostrarTiendas();
        System.out.println("Ingrese el ID de la tienda a modificar");
        int idUsuario = Integer.parseInt(input.nextLine());

        if (idUsuario < 0 || idUsuario > tiendas.size() - 1) {
            System.out.println("Tienda " + idUsuario + " no se encuentra en la lista");
        } else {

            if (tiendas.get(idUsuario) == null) {
                System.out.println("Tienda " + idUsuario + " esta eliminada");
            } else {
                for (Tienda tienda : tiendas) {
                    if (idUsuario == tienda.getId()) {
                        System.out.println("Ingrese la nueva direccion de la tienda");
                        tienda.setDireccion(input.nextLine());

                        System.out.println("Ingrese el nuevo representante de la tienda");
                        tienda.setRepresentante(input.nextLine());
                    }
                }
            }

        }

    }

    public void eliminarTienda() {
        mostrarTiendas();
        System.out.println("Ingrese el ID de la tienda a eliminar");
        int idUsuario = Integer.parseInt(input.nextLine());

        if (idUsuario < 0 || idUsuario > tiendas.size() - 1) {
            System.out.println("Tienda " + idUsuario + " no se encuentra en la lista");
        } else {

            if (tiendas.get(idUsuario) == null) {
                System.out.println("Tienda " + idUsuario + " esta eliminada");
            } else {

                Iterator<Tienda> it = tiendas.iterator();

                while (it.hasNext()) {
                    Tienda tienda = it.next();

                    if (tienda.getId() == idUsuario) {
                        it.remove();
                        System.out.println("Tienda " + idUsuario + " eliminada");
                        break;
                    }
                }
            }
        }

    }

    public void agregarProductos(Tienda t) {
        System.out.println("Cuantos productos desea agregar a la tienda?");
        int cantidad = Integer.parseInt(input.nextLine());

        HashMap<Producto, Integer> productosTienda = new HashMap<>();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Producto " + (i + 1));
            Producto p = ps.crearProducto();

            System.out.println("Cual es el stock del producto? ");
            int stock = Integer.parseInt(input.nextLine());

            productosTienda.put(p, stock);
        }

        t.setProductosTienda(productosTienda);
    }

    public void venderProductos(Tienda t) {
        mostrarProductosTienda(t);
        System.out.println("Ingrese el ID del producto de la tienda " + t.getId() + " que desea vender");
        int idUsuario = Integer.parseInt(input.nextLine());
        boolean encontrado = false;

        for (Map.Entry<Producto, Integer> entry : t.getProductosTienda().entrySet()) {
            Producto p = entry.getKey();
            Integer stock = entry.getValue();

            if (p.getId() == idUsuario) {
                encontrado = true;

                System.out.println("Cuantas unidades de " + p.getNombre() + " desea vender? ");
                int unidades = Integer.parseInt(input.nextLine());

                if (stock >= unidades) {
                    System.out.println(unidades + " unidades vendidas de " + p.getNombre());
                    entry.setValue(stock - unidades);
                } else {
                    System.out.println(p.getNombre() + " solo tiene un stock de " + stock);
                }

                break;
            }
        }

        if (!encontrado)
            System.out.println("Producto " + idUsuario + " no encontrado en la tienda " + t.getId());

    }

    public void eliminarProductos(Tienda t) {
        mostrarProductosTienda(t);
        System.out.println("Ingrese el ID del producto de la tienda " + t.getId() + " que desea eliminar");
        int idUsuario = Integer.parseInt(input.nextLine());
        boolean encontrado = false;

        Iterator<Map.Entry<Producto, Integer>> it = t.getProductosTienda().entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry<Producto, Integer> entry = it.next();
            Producto p = entry.getKey();

            if(p.getId() == idUsuario) {
                it.remove();
                encontrado = true;
                System.out.println("Producto " + idUsuario + " eliminado de la tienda " + t.getId());
                break;
            }
        }

        if (!encontrado)
            System.out.println("Producto " + idUsuario + " no encontrado en la tienda " + t.getId());
    }

    public void stockProductos(Tienda t) {
        int totalStock = 0;
        for(Integer stockProducto: t.getProductosTienda().values()) {
             totalStock += stockProducto;
        }

        System.out.println("El stock total de productos es " + totalStock);
    }

}
