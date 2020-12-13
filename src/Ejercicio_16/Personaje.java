package Ejercicio_16;

public class Personaje {
private String nombre;
private int energia;
public Personaje(String nombre, int energia) {
	this.nombre=nombre;
			this.energia=energia;}
public String getNombre() {
	return nombre; 
	}
public int getEnergia() {
	return energia; 
	}
public void alimentarse(int energiaNueva) {
	energia=energia+energiaNueva; 
	}
public void consumirEnergia(int gastoEnerg) {
	energia=energia - gastoEnerg;
}
}
