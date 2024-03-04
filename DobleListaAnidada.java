
package com.mycompany.hotelfollowers;

public class DobleListaAnidada {
    public Object[][] dobleLista;

    public DobleListaAnidada() {
        // Inicializamos la doble lista anidada con 7 posiciones en la primera lista
        // y 3 posiciones en la segunda lista, ambas llenas con null
        this.dobleLista = new Object[7][3];
    }

    public void agregarElemento(Object dato, int posicionPrimeraLista, int posicionSegundaLista) {
        // Validamos que las posiciones estén dentro de los límites
        if (posicionPrimeraLista >= 0 && posicionPrimeraLista < 7 && posicionSegundaLista >= 0 && posicionSegundaLista < 3) {
            // Verificamos si la posición en la segunda lista está ocupada
            if (dobleLista[posicionPrimeraLista][posicionSegundaLista] == null) {
                // Si está libre, almacenamos el dato en esa posición
                dobleLista[posicionPrimeraLista][posicionSegundaLista] = dato;
                
                System.out.println("Se ha agregado " + dato + " en la posición [" + posicionPrimeraLista + "][" + posicionSegundaLista + "]");
            } else {
                // Si la posición está ocupada, encontramos la primera posición libre en esa lista
                for (int i = 0; i < 3; i++) {
                    if (dobleLista[posicionPrimeraLista][i] == null) {
                        dobleLista[posicionPrimeraLista][i] = dato;
                        System.out.println("Se ha agregado " + dato + " en la posición [" + posicionPrimeraLista + "][" + i + "]");
                        break;
                    }
                }
            }
        } else {
            System.out.println("Posiciones fuera de rango.");
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        DobleListaAnidada miDobleLista = new DobleListaAnidada();

        // Agregamos elementos
        miDobleLista.agregarElemento("Dato1", 2, 1);
        miDobleLista.agregarElemento("Dato2", 4, 2);
        miDobleLista.agregarElemento("Dato3", 2, 1); // Intentando agregar en una posición ocupada

        // Imprimimos la doble lista para verificar los resultados
        for (Object[] fila : miDobleLista.dobleLista) {
            for (Object elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }
}