package Tarea1;

public class Main extends Reptiles{

	public static void main(String[] args) {
		ejecutarPrograma();
	}

	private static void ejecutarPrograma() {
		System.out.println(new Cocodrilo().getName());
		System.out.println(new Cocodrilo().descripcion());
		System.out.println("Número de patas: "+new Cocodrilo().numeroPatas());
		System.out.println("Tiene caparazón: "+new Cocodrilo().tieneCaparazon());
		System.out.println("");
		
		System.out.println(new Tortuga().getName());
		System.out.println(new Tortuga().descripcion());
		System.out.println("Número de patas: "+new Tortuga().numeroPatas());
		System.out.println("Tiene caparazón: "+new Tortuga().tieneCaparazon());
		System.out.println("");
		
		System.out.println(new Serpiente().getName());
		System.out.println(new Serpiente().descripcion());
		System.out.println("Número de patas: "+new Serpiente().numeroPatas());
		System.out.println("Tiene caparazón: "+new Serpiente().tieneCaparazon());
		System.out.println("");
		
		System.out.println("Hecho por: Adrilead / Adrianlead.");
	}
	
	@Override
	protected String descripcion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected int numeroPatas() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected boolean tieneCaparazon() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
