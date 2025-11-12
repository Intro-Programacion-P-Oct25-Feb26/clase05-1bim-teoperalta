/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String apellido;
        String usuario;
        int edad;
        String parroquia;
        int diaPago;
        int membresia = 25;
        double totalDescuento;
        double descuento;
        System.out.println("Ingrese el nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su parroquia");
        parroquia = entrada.nextLine();
        System.out.println("Ingrese su dia de pago");
        diaPago = entrada.nextInt();
        if ((diaPago) < 10 && (parroquia.equals("El Valle") ||
                parroquia.equals("El Sagrario"))) {
            descuento = membresia * 0.05;
            totalDescuento = membresia - descuento;

            System.out.printf("Recibo\nNombre: %s\nApellido: %s\n"
                    + "Usuario: %s\nEdad: %s\nParroquia: %s\nDescuento: %.2f\n"
                    + "Total a cancelar:%.2f\n", nombre, apellido,
            usuario, edad, parroquia, descuento, totalDescuento
          
            );
        } else {
             System.out.printf("Recibo\nNombre: %s\nApellido: %s\nUsuario: %s\n"
                     + "Edad: %s\nParroquia: %s\nTotal a pagar: %s\n",
            nombre, apellido,
            usuario, edad, parroquia, membresia
          
            );
        }
    }

}
