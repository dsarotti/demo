package com.example;

public class Cuenta {
    private int numero;
    private int saldo;

    public void ingresarDinero(int cantidad) throws IllegalArgumentException {
        if (cantidad <= 0)
            throw new IllegalArgumentException("la cantidad a ingresar debe ser mayor que 0");
        saldo += cantidad;
    }

    public void extraerDinero(int cantidad) throws IllegalArgumentException {
        if ((saldo - cantidad) < 0)
            throw new IllegalArgumentException();
        saldo -= cantidad;
    }

    public void mostrarCuenta() {
        System.out.println("Numero de cuenta: " + numero);
        System.out.println("Saldo disponible: " + saldo);
    }
}