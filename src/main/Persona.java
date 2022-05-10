package main;

 
public class Persona{
	 int edad;
	 int telefono;
	 String nombre;
}

class Cliente extends Persona{
	double credito;
}

class Trabajador extends Persona{
	double salario;
}