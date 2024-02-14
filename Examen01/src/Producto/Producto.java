/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Producto;

/**
 *
 * @author DELL
 */
public class Producto {
    private String codigo;
    private String prenda;
    private String talla;
    private String color;
    private String cantidad;

    public Producto(String codigo, String prenda, String talla, String color, String cantidad) {
        this.codigo = codigo;
        this.prenda = prenda;
        this.talla = talla;
        this.color = color;
        this.cantidad = cantidad;
    }
    
    public Producto(){
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrenda() {
        return prenda;
    }

    public void setPrenda(String prenda) {
        this.prenda = prenda;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
    public Object[] toArray(){
        Object[] obj = new Object[5];
        obj[0] = codigo;
        obj[1] = prenda;
        obj[2] = talla;
        obj[3] = color;
        obj[4] = cantidad;
        
        return obj;
    }
    
    
}
