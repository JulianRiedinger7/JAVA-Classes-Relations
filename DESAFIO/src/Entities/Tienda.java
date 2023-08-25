package Entities;

import java.util.HashMap;

public class Tienda {
    private HashMap<Producto, Integer> productosTienda;
    private Integer id;
    private String direccion, representante;


    public Tienda() {
        this.productosTienda = new HashMap<>();
    }

    public Tienda(HashMap<Producto,Integer> productosTienda, Integer id, String direccion, String representante) {
        this.productosTienda = productosTienda;
        this.id = id;
        this.direccion = direccion;
        this.representante = representante;
    }

    public HashMap<Producto,Integer> getProductosTienda() {
        return this.productosTienda;
    }

    public void setProductosTienda(HashMap<Producto,Integer> productosTienda) {
        this.productosTienda = productosTienda;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRepresentante() {
        return this.representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    @Override
    public String toString() {
        return "{" +
            " productosTienda='" + getProductosTienda() + "'" +
            ", id='" + getId() + "'" +
            ", direccion='" + getDireccion() + "'" +
            ", representante='" + getRepresentante() + "'" +
            "}";
    }

}
