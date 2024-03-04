package com.mycompany.hotelfollowers;

public class Trabajadores {
    private String rol;
    private int cantidadTrabajador;
    private int cantidadHorasTrabajador;
    private String Turno;
    private String Nombre;

    public Trabajadores(String rol, int cantidadTrabajador, int cantidadHorasTrabajador, String Turno, String Nombre) {
        this.rol = rol;
        this.cantidadTrabajador = cantidadTrabajador;
        this.cantidadHorasTrabajador = cantidadHorasTrabajador;
        this.Turno = Turno;
        this.Nombre = Nombre;
    }
    
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getCantidadTrabajador() {
        return cantidadTrabajador;
    }

    public void setCantidadTrabajador(int cantidadTrabajador) {
        this.cantidadTrabajador = cantidadTrabajador;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidadHorasTrabajador() {
        return cantidadHorasTrabajador;
    }

    public void setCantidadHorasTrabajador(int cantidadHorasTrabajador) {
        this.cantidadHorasTrabajador = cantidadHorasTrabajador;
    }

    @Override
    public String toString() {
        return "Trabajadores{" + "rol=" + rol + ", cantidadTrabajador=" + cantidadTrabajador + ", cantidadHorasTrabajador=" + cantidadHorasTrabajador + ", Turno=" + Turno + ", Nombre=" + Nombre + '}';
    }
}
