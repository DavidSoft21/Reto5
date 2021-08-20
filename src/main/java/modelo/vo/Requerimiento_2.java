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
public class Requerimiento_2 {
    
    //Atributos
    private String fechaIni;
    private String nombreCiudad;
    private int codigoTipo;
    private String Constructora;
    private String Nombrelider;
    private String Primer_Apellido;
    private int Estrato;

    public Requerimiento_2() {
    }

    public Requerimiento_2(String fechaIni, String nombreCiudad, int codigoTipo, String Constructora, String Nombrelider, String Primer_Apellido, int Estrato) {
        this.fechaIni = fechaIni;
        this.nombreCiudad = nombreCiudad;
        this.codigoTipo = codigoTipo;
        this.Constructora = Constructora;
        this.Nombrelider = Nombrelider;
        this.Primer_Apellido = Primer_Apellido;
        this.Estrato = Estrato;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public void setCodigoTipo(int codigoTipo) {
        this.codigoTipo = codigoTipo;
    }

    public void setConstructora(String Constructora) {
        this.Constructora = Constructora;
    }

    public void setNombrelider(String Nombrelider) {
        this.Nombrelider = Nombrelider;
    }

    public void setPrimer_Apellido(String Primer_Apellido) {
        this.Primer_Apellido = Primer_Apellido;
    }

    public void setEstrato(int Estrato) {
        this.Estrato = Estrato;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public int getCodigoTipo() {
        return codigoTipo;
    }

    public String getConstructora() {
        return Constructora;
    }

    public String getNombrelider() {
        return Nombrelider;
    }

    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }

    public int getEstrato() {
        return Estrato;
    }

 
    
    
    
}
