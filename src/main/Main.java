package main;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Trabajador trabajador = new Trabajador();
		
		cliente.edad = 25;
		cliente.telefono = 999999999;
		cliente.nombre ="Juan";
		cliente.credito = 23000.0;
		
		trabajador.edad = 23;
		trabajador.telefono = 888888888;
		trabajador.nombre = "Diego";
		trabajador.salario = 4300.0;
		
		System.out.println("|Nombre: " + cliente.nombre + "|telefono: " + cliente.telefono + "|edad: " + cliente.edad + "|credito: " + cliente.credito +"|");
		
		System.out.println("------------------------------------------------------------");
		
		System.out.println("|Nombre: " + trabajador.nombre + "|telefono: " + trabajador.telefono + "|edad: " + trabajador.edad + "|salario: " + trabajador.salario +"|");
		
		
		
	}

}
