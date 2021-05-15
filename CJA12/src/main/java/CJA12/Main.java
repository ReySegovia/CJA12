/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CJA12;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author reyse
 */
public class Main {
    public static void main(String[] args) throws IOException{
        AddressBook addressbook = new AddressBook();
        Main showMenu = new Main();
        showMenu.showMenu();
    }
        
        public void showMenu() throws IOException {
            Scanner input = new Scanner(System.in);
            AddressBook addressbook = new AddressBook();
            System.out.println("Bienvenido a AddressBook! ");
            System.out.println("Elige una opcion:");
            System.out.println("1.Listar contactos");
            System.out.println("2.Agregar contacto");
            System.out.println("3.Eliminar contacto");
            System.out.println("0.Salir");

            int option = input.nextInt();
            while (option > 0) {
                if (option < 1 || option > 3) {
                    System.err.println("Teclea una opción válida:");
                    System.err.println("1.Listar contactos");
                    System.err.println("2.Agregar contacto");
                    System.err.println("3.Eliminar contacto");
                    System.err.println("0.Salir");
                    if (input.hasNextInt()) {
                        option = input.nextInt();
                    }
                } else if (option == 1) {
                    System.out.println("Listando contactos... ");
                    addressbook.list();
                    System.out.println("Presiona 0 para salir o selecciona una nueva opcion: ");
                    System.out.println("1.Listar contactos");
                    System.out.println("2.Agregar contacto");
                    System.out.println("3.Eliminar contacto");
                    if (input.hasNextInt()) {
                        option = input.nextInt();
                    }
                    
                } else if (option == 2) {
                    System.out.println("Escribe telefono y nombre del contacto a agregar");
                    System.out.println("Telefono: ");
                    String telefono = input.next();
                    System.out.println("Nombre: ");
                    String nombre = input.next();
                    addressbook.hm.put(telefono, nombre);
                    addressbook.create();
                    System.out.println("Presiona 0 para salir o selecciona una nueva opcion: ");
                    System.out.println("1.Listar contactos");
                    System.out.println("2.Agregar contacto");
                    System.out.println("3.Eliminar contacto");
                    if (input.hasNextInt()) {
                        option = input.nextInt();
                    }
                } else if (option == 3) {
                    System.out.println("Eliminar contacto: ");
                    System.out.println("Escribe el numero telefonico del contacto a eliminar: ");
                    String telefono = input.next();
                    addressbook.hm.remove(telefono);
                    addressbook.delete();
                    System.out.println("Presiona 0 para salir o selecciona una nueva opcion: ");
                    System.out.println("1.Listar contactos");
                    System.out.println("2.Agregar contacto");
                    System.out.println("3.Eliminar contacto");
                    if (input.hasNextInt()) {
                        option = input.nextInt();
                    }
                }
            }
        }
}