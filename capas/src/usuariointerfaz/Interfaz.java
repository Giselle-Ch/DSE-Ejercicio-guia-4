package usuariointerfaz;

import java.util.Scanner;
import datos.Contacto;
import negocio.Agenda;

public class Interfaz {
	static Scanner entrada= new Scanner(System.in);
	static Agenda Libro= new Agenda();
	public static void lectura() {
		System.out.println("Bienvenido");
		System.out.println("Elija una opci�n");
		
		imprimirMenu();
	}
	private static void validar() {
		System.out.println("Ingresar nuevo contacto");
		System.out.println("Ingrese la informaci�n del contacto");
		System.out.println("El nombre debe contener m�ximo 10 caracteres");
		System.out.println("El celular contiene 8 digitos\n");
		
		Contacto contacto= new Contacto();
		
		System.out.println("Nombre: ");
		contacto.setNombre(entrada.next());
		System.out.println("Tel�fono: ");
		contacto.setCelular(entrada.nextLong());
		
		if(Libro.add(contacto)==true) {
			System.out.println("El contacto ha sido agregado\n");
		} else {
			System.out.println("Error al ingresar los datos");
			System.out.println("Si desea agregar un contacto elija la opci�n 1\n");
		}
		imprimirMenu();
	}
	private static void mostrarContactos() {
		System.out.println(Libro);
		imprimirMenu();
	}
	private static void salir() {
		System.out.println("Fin de la ejecuci�n");
		System.exit(0);
	}
	private static void imprimirMenu() {
		System.out.println("\nBienvenido");
		System.out.println("Elija una opci�n");
		System.out.println("1. Nuevo contacto");
		System.out.println("2. Contactos");
		System.out.println("3. Salir\n");
		
		int opcion = entrada.nextInt();
		switch(opcion) {
		case 1: validar();
			break;
		case 2: mostrarContactos();
			break;
		case 3: salir();
			break;
		default: System.out.println("Opci�n inv�lida");
			break;
		}
	}

}
