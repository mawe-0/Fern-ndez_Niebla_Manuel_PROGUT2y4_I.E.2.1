package Ejercicio_8;

public class Asignaturas {

    private String nombre;
    private double nota;
    
    public Asignaturas(String nombre, double nota) {

      this.nombre = nombre;
      this.nota= nota;
     
     }

    public String getNombre() {
      return nombre;
     }
    
    public void  setNombre(String nombre) {
      this.nombre= nombre;
     }

    public double getNota() {
      return nota;
     }
  
  
    public void setNota(double nota) {
  this.nota = nota;
     }
  
    public String estado(){
 return (nota < 60 ? "Reprobada" : "Aprobada");
      }

    @Override
    public String toString() {
     return "Nombre: " + nombre + ", Nota: " + nota +",  Estado: "+ estado()+"\n" ;
     }
}

