/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menurestaurante;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class MenuRestaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] menu1 = {"Hamburguesa", "Pizza", "Hot Dog"};
        double[] preciosMenu1 = {10.0, 8.0, 5.0};

        String[] menu2 = {"Sushi", "Tacos", "Ensalada"};
        double[] preciosMenu2 = {15.0, 12.0, 7.0};

        String[] menu3 = {"Pasta", "Pollo a la Parrilla", "Sandwich"};
        double[] preciosMenu3 = {12.0, 9.0, 6.0};

        System.out.println("Menú 1:");
        mostrarMenu(menu1, preciosMenu1);
        System.out.println("\nMenú 2:");
        mostrarMenu(menu2, preciosMenu2);
        System.out.println("\nMenú 3:");
        mostrarMenu(menu3, preciosMenu3);

        System.out.print("\nElija un menú (1, 2 o 3): ");
        int opcionMenu = scanner.nextInt();

        double costoTotal = 0.0;
        if (opcionMenu == 1) {
            costoTotal = calcularCostoMenu(preciosMenu1, scanner);
        } else if (opcionMenu == 2) {
            costoTotal = calcularCostoMenu(preciosMenu2, scanner);
        } else if (opcionMenu == 3) {
            costoTotal = calcularCostoMenu(preciosMenu3, scanner);
        } else {
            System.out.println("Selección de menú no válida.");
        }

        if (costoTotal > 0) {
            System.out.println("El costo total del pedido es: $" + costoTotal);
        }

        scanner.close();
    }

    public static void mostrarMenu(String[] menu, double[] precios) {
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + 1 + ". " + menu[i] + " - $" + precios[i]);
        }
    }

    public static double calcularCostoMenu(double[] precios, Scanner scanner) {
        double costoTotal = 0.0;

        System.out.println("Seleccione una comida (1, 2 o 3) o ingrese 0 para finalizar:");
        int seleccion;
        do {
            seleccion = scanner.nextInt();
            if (seleccion >= 1 && seleccion <= precios.length) {
                costoTotal += precios[seleccion - 1];
            } else if (seleccion != 0) {
                System.out.println("Selección no válida. Intente de nuevo.");
            }
        } while (seleccion != 0);

        return costoTotal;
    }
}

