package Ejercicio_8;
public class Aplicacion {
public static void main(String[] args) {
	     
	        Alumno est1= new Alumno("José", 21);
	 Alumno est2= new Alumno("María", 19);
	 Alumno est3= new Alumno("Antonio",17);

	 est1.matAsig(new Asignaturas("POO",100));
	 est1.matAsig(new Asignaturas("Fisica",100));
	 est1.matAsig(new Asignaturas("Calculo",58));
	 est2.matAsig(new Asignaturas("POO",61));
	 est2.matAsig(new Asignaturas("Fisica",88));
	 est2.matAsig(new Asignaturas("Calculo",54));
	 est3.matAsig(new Asignaturas("POO",91));
	 est3.matAsig(new Asignaturas("Fisica",59));
	 est3.matAsig(new Asignaturas("Calculo",77));
	   
	  System.out.println("" + est1 +"\n"+est2 +"\n" +est3);
	    
	    }
	    
	}
