
public class Clase {
	
	private boolean bandera = false;
	
	
	public synchronized void saludoAlumnos(int numero) {
		
		while(!bandera) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Buenos dias profesor");
		notifyAll();
	}
	
	
	public synchronized void saludoProfesor(String nombre) {
		
		System.out.println("Soy el profesor "+nombre);
		bandera = true;
		notifyAll();
		
		
	}
	
	

}
