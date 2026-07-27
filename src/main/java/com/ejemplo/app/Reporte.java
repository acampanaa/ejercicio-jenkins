package com.ejemplo.app;

public class Reporte {

    public String generarReporteVentas(int cantidad, double precio) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== REPORTE ===\n");
        sb.append("Cantidad: ").append(cantidad).append("\n");
        sb.append("Precio unitario: ").append(precio).append("\n");
        double subtotal = cantidad * precio;
        sb.append("Subtotal: ").append(subtotal).append("\n");
        double impuesto = subtotal * 0.12;
        sb.append("Impuesto: ").append(impuesto).append("\n");
        sb.append("Total: ").append(subtotal + impuesto).append("\n");
        sb.append("===============\n");
        return sb.toString();
    }

    public String generarReporteCompras(int cantidad, double precio) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== REPORTE ===\n");
        sb.append("Cantidad: ").append(cantidad).append("\n");
        sb.append("Precio unitario: ").append(precio).append("\n");
        double subtotal = cantidad * precio;
        sb.append("Subtotal: ").append(subtotal).append("\n");
        double impuesto = subtotal * 0.12;
        sb.append("Impuesto: ").append(impuesto).append("\n");
        sb.append("Total: ").append(subtotal + impuesto).append("\n");
        sb.append("===============\n");
        return sb.toString();
    }

    public String generarReporteDevoluciones(int cantidad, double precio) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== REPORTE ===\n");
        sb.append("Cantidad: ").append(cantidad).append("\n");
        sb.append("Precio unitario: ").append(precio).append("\n");
        double subtotal = cantidad * precio;
        sb.append("Subtotal: ").append(subtotal).append("\n");
        double impuesto = subtotal * 0.12;
        sb.append("Impuesto: ").append(impuesto).append("\n");
        sb.append("Total: ").append(subtotal + impuesto).append("\n");
        sb.append("===============\n");
        return sb.toString();
    }

    public int contarCaracteres() {
        String texto = null;
        return texto.length();
    }

    public boolean compararCodigos(String a, String b) {
        return a == b;
    }
}
