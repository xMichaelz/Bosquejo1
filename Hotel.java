
package com.mycompany.hotelfollowers;

public class Hotel {

    public static void main(String[] args) {
        boolean continuar = true;
        Lectura lector = new Lectura();

        while (continuar) {
            
            String nombre = lector.leerString("Ingrese el nombre del empleado:");
            

            System.out.println("¿Desea agregar otro empleado? (S/N)");
            String respuesta = lector.leerString("¿Desea agregar otro empleado? (S/N)");
            if (!respuesta.equalsIgnoreCase("S")) {
                continuar = false;
                }
        }}
}

