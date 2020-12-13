package Ejercicio_6;
public class Empleado extends Persona{
	protected int sueldo;
	public void cargarSueldo() {
		System.out.print("Ingrese sueldo:");
		sueldo=teclado.nextInt();
	}
	public void imprimirSueldo() {
		System.out.println("El sueldo es:"+sueldo);
	}
}