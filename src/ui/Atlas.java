/*
* Analisis
* Descripcion del programa:
* Entradas:
* Salidas: 
* Ejemplo:
*/

package ui;

import java.util.Scanner;

public class Atlas {

	private Scanner escaner;

    // Declaracion de constantes (completar)
    final double COSTO_TRAYECTO_AVION = 250000;

	private Atlas() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{   
        // Declaracion de info a pedir del usuario 
        String nombre;
        // Saludo
        System.out.println("Bienvenido al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y programacion I de la Universidad ICESI.");
        // Pedir info al usuario
        System.out.println("Cual es tu nombre?");
        nombre = escaner.nextLine();

        // Bienvenida
        System.out.println("Bienvenido " + nombre + "!");
        
        // Edad
        int edad;
        System.out.println ("Podrias decirnos cual es tu edad?");
        edad = escaner.nextInt();

        // Documento
        int documento;
        System.out.println ("Muy bien ahora danos el numero de tu documento de identidad");
        documento = escaner.nextInt();

        //Ciudad
        String ciudad;
        System.out.println ("Por ultimo, especifica a que ciudad te diriges");
        ciudad = escaner.nextLine();

        //Confirmacion
        System.out.println (nombre+" te confirmo tus datos");
        System.out.println ("Tu edad es: " + edad);
        System.out.println ("Tu numero de documento es: "+documento);
        System.out.println ("La ciudad a la que viajas es: "+ciudad);


        // determinar cuantas noches se queda
        System.out.print ("Necesitamos saber cuantas noches vas a quedarte, recuerda que tienes hasta 4 noches y cada noche vale $150.000. ");
        System.out.println ("Recuerda que debes hospedarte por lo menos una noche con ATLAS.");
        // Delegamos al metodo calcularNoches
        int cantidadNoches, totalNoches;
        final int PRECIO_NOCHES = 150000;
        cantidadNoches = escaner.nextInt();

        //condicional para definir el precio de noches teniendo en cuenta que debe ser por lo menos una y maximo 4
        if (4>=cantidadNoches>=1){
            totalNoches = calcularNoches (cantidadNoches, PRECIO_NOCHES);
            System.out.println ("El total para " +cantidadNoches+ " noches es: $" + totalNoches);
        } else if(cantidadNoches<1){
            System.out.println ("Recuerda que tienes que alojarte por lo menos una noche!");
        } else {
            System.out.println ("Tu paquete solo incluye hasta 4 noches en el hotel, lo sentimos");
        }
        
        
        // Declaracion de salidas calculadas (completar)
        
        // Calculo de salidas mediante metodos (completar)
        double totalTransporte;
        int cantidadViajes;
        final int PRECIO_TRANSPORTE = 250000;

        System.out.println("Por favor pon cuantos trayectos realizaras por avion, (por ejemplo si es un solo viaje ida y vuelta, coloca 2)");
        cantidadViajes = escaner.nextInt();
        totalTransporte = calcularTotalTransporte(cantidadViajes, PRECIO_TRANSPORTE);
        System.out.println("El precio por trayecto corresponde a $250.000, lo que quiere decir que ida y vuelta saldría a: $" +totalTransporte);
	}
    
	public static void main(String[] args) {
		Atlas mainApp = new Atlas();
		mainApp.run();
        Atlas mainApp = new Atlas();
		mainApp.hotel();
	}

    // Completar metodos para calcular salidas
    /**
	 * Descripción: El método ... permite calcular ...
	 * @param 
	 * @return 
	 */
    public int calcularNoches(int noches, int precio) {
        return noches * precio; 
    }
    public double calcularTotalTransporte(int viajes, int precio) {
        return viajes*precio;
    }

	

	
}