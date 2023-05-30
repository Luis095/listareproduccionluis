/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listadereproduccion1;

/**
 *
 * @author raymundo
 */
public class Listadereproduccion1 {

    public static void main(String[] args) {
        import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaReproduccion {
    private List<String> canciones;
    private int indiceActual;

    public ListaReproduccion() {
        canciones = new ArrayList<>();
        indiceActual = -1;
    }

    public void agregarCancion(String cancion) {
        canciones.add(cancion);
    }

    public void reproducirSiguiente() {
        if (canciones.isEmpty()) {
            System.out.println("La lista de reproducción está vacía.");
            return;
        }

        indiceActual++;
        if (indiceActual >= canciones.size()) {
            indiceActual = 0;
        }

        System.out.println("Reproduciendo: " + canciones.get(indiceActual));
    }

    public static void main(String[] args) {
        ListaReproduccion lista = new ListaReproduccion();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar canción");
            System.out.println("2. Reproducir siguiente");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre de la canción: ");
                    String cancion = scanner.nextLine();
                    lista.agregarCancion(cancion);
                    break;
                case 2:
                    lista.reproducirSiguiente();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}

    }
}
