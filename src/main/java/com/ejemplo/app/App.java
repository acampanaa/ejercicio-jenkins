package com.ejemplo.app;

public class App {

    /**
     * Funcion 1: suma dos numeros enteros.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Funcion 2: determina si un numero es par.
     */
    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Suma 2 + 3 = " + app.sumar(2, 3));
        System.out.println("¿4 es par? " + app.esPar(4));
    }
}
