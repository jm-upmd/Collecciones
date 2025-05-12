package actividad2;

import java.util.*;

public class Actividad2 {
    public static void main(String[] args) {
        /*Insertar en una lista 20 enteros aleatorios entre 1 y 10. A partir de ella, crear un
        conjunto con los elementos de la lista sin repetir, otro con los repetidos y otro con los
        elementos que aparecen una sola vez en la lista original.
         */

        /* Usamos un ArrayList para meter los 20 elementos generados aleatoriamente.
        NOTA: En este caso, como sabemos que son 20 elementos sería mejor usar un array,pero usamos ArrayList
        para ejemplificar su uso.
        */

        // Si sabemos capacidad de antemano es mejor pasarsela al constructor.
        List<Integer> lisatNumAleatorios = new ArrayList<>(20);

        // Generamos aleatorios entre 1 y 100 y guardamos en la lista
        Random generador = new Random();
        for (int i = 1; i <=20 ; i++) {
            lisatNumAleatorios.add(generador.nextInt(1,11));
        }


        // Cramos sets para:
        // Elementos de la lista sin repetir
        Set<Integer> noRepetidos = new HashSet<>();
        Set<Integer> repetidos = new TreeSet<>();
        Set<Integer> soloUnaVezEnOriginal = new HashSet<>();
        boolean anadido;
        for (Integer n : lisatNumAleatorios) {
           anadido =  noRepetidos.add(n);
           if(!anadido){
               repetidos.add(n);
           }
        }
        // Los que solo estaban un vez en original no están en repetidos.
        // Repetidos hemos guarda en un TreeSet pq. se guardan ordenados y las búsquedas son más óptimas.
        for (Integer n : lisatNumAleatorios) {
            if(!repetidos.contains(n)){
                soloUnaVezEnOriginal.add(n);
            }
        }

        // Mostramos todas las listas
        System.out.println("Lista inicial de aleatorios");
        System.out.println(lisatNumAleatorios);
        System.out.println("Lista sin repetidos");
        System.out.println(noRepetidos);
        System.out.println("Lista con los repetidos");
        System.out.println(repetidos);
        System.out.println("Lista con los originales que no se repiten ninguna vez");
        System.out.println(soloUnaVezEnOriginal);

    }
}
