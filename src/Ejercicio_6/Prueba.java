package Ejercicio_6;

public class Prueba {
public static void main(String[]ar) {
	Persona persona1=new Persona();
	persona1.cargarDatosPersonales();
	persona1.imprimirDatosPersonales();
Empleado empleado1=new Empleado();
empleado1.cargarDatosPersonales();
empleado1.cargarSueldo();
empleado1.imprimirDatosPersonales();
empleado1.imprimirSueldo();
}
}

