package Ejercicio_16;
public class Guerrero extends Personaje{
private String arma;
public Guerrero(String nombre, int energia, String arma) {
	super(nombre, energia);
	this.arma=arma;
}
public String combatir(int energ) {
	actualizaEnergia( -1*energ);
	return arma+energ;
}
private void actualizaEnergia(int i) {
	Guerrero g1= new Guerrero("Alfa", 50, "Lluvia de cuchillas");
	g1.combatir( 2);
	System.out.println("El nivel de energía de"+g1.getNombre()+"es"+g1.getEnergia());
}

}
