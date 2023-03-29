package com.tubancoapp.modelo;

public class CuentaAhorro extends Cuenta {
    // 1. Atributos
    protected double saldoAnterior;
    protected double ingresos;
    protected double retiros;

    // 2. Métodos
    @Override
    public String toString() {
        return "CuentaAhorro { " +
                "saldoAnterior = " + saldoAnterior +
                ", ingresos = " + ingresos +
                ", retiros = " + retiros + " " +
                "} " + super.toString();
    }
    @Override
    public double calcularSaldo() {
        return saldoAnterior + ingresos - retiros;
    }

    public double calcularSaldo(double tasaIntereses) {
        return (saldoAnterior * tasaIntereses) + ingresos - retiros;
    }

    // 3. Constructores
    public CuentaAhorro() {
    }

    public CuentaAhorro(String nombre, String dni, String direccion, double saldoAnterior, double ingresos, double retiros) {
        super(nombre, dni, direccion);
        this.saldoAnterior = saldoAnterior;
        this.ingresos = ingresos;
        this.retiros = retiros;
    }

    // 4. Getters y Setters
    public double getSaldoAnterior() {
        return saldoAnterior;
    }
    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }
    public double getIngresos() {
        return ingresos;
    }
    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
    public double getRetiros() {
        return retiros;
    }
    public void setRetiros(double retiros) {
        this.retiros = retiros;
    }
}
