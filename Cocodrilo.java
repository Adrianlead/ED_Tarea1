package Tarea1;

public class Cocodrilo extends Reptiles{

	public String getName() {
		return "Cocodrilo";
	}
	
	protected String descripcion() {
		return "Animal de gran tama�o. Tiene muchos colmillos enormes.";
	}
	
	protected int numeroPatas() {
		return 4;
	}
	
	protected boolean tieneCaparazon() {
		return false;
	}

}
