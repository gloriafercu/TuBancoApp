package com.tubancoapp.modelo;

public class CuentaNomina extends CuentaAhorro {
    // 1. Atributos
    private String ss;
    private String empresa;
    private double comision;

    // 2. Métodos
    @Override
    public String toString() {
        return "CuentaNomina { " +
                "ss = '" + ss + '\'' +
                ", empresa = '" + empresa + '\'' +
                ", comision = " + comision + " "+
                "} " + super.toString();
    }
    @Override
    public double calcularSaldo() {
        return saldoAnterior + ingresos - retiros - comision;
    }

    // 3. Constructores
    public CuentaNomina() {
    }

    public CuentaNomina(String nombre, String dni, String direccion, double saldoAnterior, double ingresos, double retiros, String ss, String empresa, double comision) {
        super(nombre, dni, direccion, saldoAnterior, ingresos, retiros);
        this.ss = ss;
        this.empresa = empresa;
        this.comision = comision;
    }

    // 4. Getters y Setters
    public String getSs() {
        return ss;
    }
    public void setSs(String ss) {
        this.ss = ss;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public double getComision() {
        return comision;
    }
    public void setComision(double comision) {
        this.comision = comision;
    }
}
