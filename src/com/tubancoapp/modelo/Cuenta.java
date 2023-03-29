package com.tubancoapp.modelo;

public abstract class Cuenta {
    // 1. Atributos
    protected String nombre;
    protected  String dni;
    protected  String direccion;

    // 2. Métodos
    @Override
    public String toString() {
        return "Cuenta { " +
                "nombre = '" + nombre + '\'' +
                ", dni = '" + dni + '\'' +
                ", direccion = '" + direccion + '\'' + " "+
                '}';
    }
    public abstract double calcularSaldo();

    // 3. Constructores
    public Cuenta() {
    }
    public Cuenta(String nombre, String dni, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }

    // 4. Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
