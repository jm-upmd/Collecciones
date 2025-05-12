package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        System.out.print("Introducir número: ");
        int n = new Scanner(System.in).nextInt();
        while (n >= 0) {
            lista.add(n);
            System.out.print("Introducir número: ");
            sc.nextLine(); // Saca caracter de nueva línea del buffer
            n = sc.nextInt();
        }
        System.out.println(lista);
        System.out.print("Índices de valores pares: ");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                System.out.print(i + " ");
                lista.set(i, lista.get(i) * 100);
            }
        }
        System.out.println();
        System.out.println("Lista con valores pares actualizados (multiplicados por 100");
        System.out.println(lista);
    }
}