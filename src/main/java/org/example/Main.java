package org.example;

import org.example.conexion.clsConexion;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        clsConexion conexion = new clsConexion();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n\t-----------------------------");
            System.out.println("\t*** MENU DE BASE DE DATOS ***");
            System.out.println("\t-----------------------------");
            System.out.println("\nELIJA UNA OPCIÓN.");
            System.out.println("\n1. Agregar datos");
            System.out.println("2. Actualizar datos");
            System.out.println("3. Eliminar datos");
            System.out.println("4. Mostrar datos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    conexion.insertarDatos();
                    break;
                case 2:
                    conexion.actualizarDatos();
                    break;
                case 3:
                    conexion.eliminar();
                    break;
                case 4:
                    conexion.leerDatos();
                    break;
                case 5:
                    conexion.cerrarConexion();
                    System.exit(0);
                default:
                    System.out.println(" *** OPCION INGRESADA NO VALIDA ***");
                    System.out.println("**** INGRESE UNA OPCION VALIDA ****");
            }
        }
    }
}