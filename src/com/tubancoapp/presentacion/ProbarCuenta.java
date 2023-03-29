package com.tubancoapp.presentacion;

import com.tubancoapp.modelo.Cuenta;
import com.tubancoapp.modelo.CuentaAhorro;
import com.tubancoapp.modelo.CuentaNomina;

public class ProbarCuenta {
    public static void main(String[] args) {

        /* Creamos una cuenta Ahorro */

        System.out.println("-----CUENTA AHORRO-----");
        Cuenta ca1 = new CuentaAhorro("Pedro", "12345678A", "C/Margarita 15, Madrid", 4500.90, 2000.45, 567.4);
        // Asignamos el objeto CuentaAhorro a una variable de tipo CuentaAhorro ca2 y casting
        CuentaAhorro ca2 = (CuentaAhorro) ca1;
        System.out.println("Cuenta Ahorro ca2: " + ca2);
        System.out.println("El saldo calculado de la cuentaAhorro ca2 es: " + ca2.calcularSaldo());
        System.out.println("El saldo calculado de la cuentaAhorro con Intereses ca2 es: " + ca2.calcularSaldo(2));
        // Modifique el valor del dni del cliente con el setter
        System.out.println("El dni del cliente cuentaAhorro ca2 es: " + ca2.getDni());
        ca2.setDni("9999999A");
        // Obtengo el nuevo valor del dni el cliente con el getter
        System.out.println("El dni del cliente cuentaAhorro ca2 después de modificación: " + ca2.getDni());

        /* Creamos una cuenta Nómina */

        System.out.println("-----CUENTA NÓMINA-----");
        Cuenta cn1 = new CuentaNomina("Luis", "12345678B", "C/Febrero 23, Madrid", 15678.99, 3450.65, 1235.66, "123456FF67LKX", "Accenture", 500);
        // Asignamos el objeto CuentaNomina a una variable de tipo CuentaNomina cn2 y casting
        CuentaNomina cn2 = (CuentaNomina) cn1;
        System.out.println("Cuenta Nomina cn2: " + cn2);
        System.out.println("El saldo calculado de la cuentaNomina cn2 es: " + cn2.calcularSaldo());
        System.out.println("La comisión del cliente cuentaNomina cn2 después: " + cn2.getComision());
        cn2.setComision(10000);
        System.out.println("La comisión del cliente cuentaNomina cn2 después de modificación: " + cn2.getComision());
        System.out.println("Nuevo saldo: " + cn2.calcularSaldo());

    }
}