package Ejercicio_16;

public class Mago extends Personaje{
	private String poder;
	public Mago(String nombre, String poder) {
		super(nombre, 100);
		this.poder=poder;
	}
public String encantar() {
	actualizaEnergia( -2);
	return poder;
}
private void actualizaEnergia(int i) {
	Mago m1 = new Mago ("Harry", "Congelar");
	m1.encantar();
	System.out.println("El nivel de energía de"+m1.getNombre()+"es"+m1.getEnergia());
	
}
}
