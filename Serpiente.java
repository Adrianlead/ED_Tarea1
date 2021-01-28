package Tarea1;

public class Serpiente extends Reptiles{

	public String getName() {
		return "Serpiente";
	}
	
	protected String descripcion() {
		return "Animal carente de brazos o piernas. Se arrastra por el suelo.";
	}
	
	protected int numeroPatas() {
		return 0;
	}
	
	protected boolean tieneCaparazon() {
		return false;
	}
}
