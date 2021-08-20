/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.vo;

/**
 *
 * @author david
 */
public class Requerimiento_1 {
    //Atributos
    private String fechaCompra;
    private String nombreProveedor;
    private String pagado;
    private Integer codCompra;
    
    public Requerimiento_1() {
    }

    public Requerimiento_1(String fechaCompra, String nombreProveedor, String pagado, Integer codCompra) {
        this.fechaCompra = fechaCompra;
        this.nombreProveedor = nombreProveedor;
        this.pagado = pagado;
        this.codCompra = codCompra;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public String getPagado() {
        return pagado;
    }

    public Integer getCodCompra() {
        return codCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public void setPagado(String pagado) {
        this.pagado = pagado;
    }

    public void setCodCompra(Integer codCompra) {
        this.codCompra = codCompra;
    }
    
    

  
   
    
   

}
