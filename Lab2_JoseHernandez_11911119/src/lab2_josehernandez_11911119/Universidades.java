package lab2_josehernandez_11911119;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jrdjh
 */
public class Universidades {

    private String nombreUni;
    private String nombreRect;
    private String Sucursal;
    private int creacion;
    private int maestros;
    private int estudiantes;
    private double costoMensual;
    private String nivel;

    public Universidades() {

    }

    public Universidades(String nombreUni, String nombreRect, String Sucursal, int creacion, int maestros, int estudiantes, double costoMensual, String nivel) {
        this.nombreUni = nombreUni;
        this.nombreRect = nombreRect;
        this.Sucursal = Sucursal;
        this.creacion = creacion;
        this.maestros = maestros;
        this.estudiantes = estudiantes;
        this.costoMensual = costoMensual;
        this.nivel = nivel;

    }

    public String getNombreUni() {
        return nombreUni;
    }

    public String getNombreRect() {
        return nombreRect;
    }

    public String getSucursal() {
        return Sucursal;
    }

    public int getCreacion() {
        return creacion;
    }

    public int getMaestros() {
        return maestros;
    }

    public int getEstudiantes() {
        return estudiantes;
    }

    public double getCostoMensual() {
        return costoMensual;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNombreUni(String nombreUni) {
        this.nombreUni = nombreUni;
    }

    public void setNombreRect(String nombreRect) {
        this.nombreRect = nombreRect;
    }

    public void setSucursal(String Sucursal) {
        this.Sucursal = Sucursal;
    }

    public void setCreacion(int creacion) {
        this.creacion = creacion;
    }

    public void setMaestros(int maestros) {
        this.maestros = maestros;
    }

    public void setEstudiantes(int estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void setCostoMensual(double costoMensual) {
        this.costoMensual = costoMensual;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "" + "-Nombre de la universidad: " + nombreUni + "\n"
                + "-Sucursal: " + Sucursal + "\n"
                + "-Año de Creacion: " + creacion + "\n"
                + "-Costo Mensual: " + "Lps." + costoMensual + "\n"
                + "-Nivel: " + nivel + "\n";
    }

}
