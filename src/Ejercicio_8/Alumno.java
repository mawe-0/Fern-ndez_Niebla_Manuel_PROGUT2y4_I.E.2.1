package Ejercicio_8;
import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<Object>  lista= new ArrayList<>();
	private int edad;

    public Alumno(String nombre, int edad) {
      this.nombre = nombre;
      this.edad= edad;
    }

    public String getNombre() {
    return nombre;
    }
   
    public void  setNombre(String nombre) {
      this.nombre= nombre;
    }

    public int getEdad() {
     return edad;
    }
   
     public void  setEdad(int edad) {
       this.edad= edad;
    }
    public ArrayList<Object> getLista() {
       return lista;
    }
   public void voidsetLista (ArrayList<?> Lista, ArrayList<Object> lista) {
     this.lista= lista;
    }

   public void matAsig(Asignaturas a){
   
 if(!lista.contains(a)) {
            lista.add(a);
 }else{
            System.out.println("La asignatura ya esta matriculada!");
 }
  
    }
  
    public double promedio(){
 double suma = 0.0;
 for(Object a: lista){
     suma += ((Asignaturas) a).getNota();
 }
 return suma/lista.size();
    }
    public String toString() {
 return "\nNombre: " + nombre + "\nEdad: " 
                + edad +"\nAsignaturas: \n" + lista+ "\nPromedio: "+ promedio() ;
   }
  
}