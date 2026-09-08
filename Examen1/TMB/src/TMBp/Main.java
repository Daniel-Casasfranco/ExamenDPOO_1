package TMBp;

public class Main {
	public static void main(String[] args) {
		
		// Para Mujeres
		
		double alturaM = 150;
		double pesoM = 60;
		int aniosM = 20;
		
		// Datos Correctos
		Mujer m1 = new Mujer(pesoM, alturaM, aniosM);
		
		System.out.println("Mujer Con datos correctos");
		System.out.println(m1.calcularMTB());
		
		double alturaM2 = 190;
		double pesoM2 = 60;
		int aniosM2 = 20;
		
		// Datos incorrectos
		Mujer m2 = new Mujer(pesoM2, alturaM2, aniosM2);
		
		System.out.println("Mujer Con datos correctos");
		System.out.println(m2.calcularMTB());
		
		// Para Hombres 
		
		double alturaH = 170;
		double pesoH = 80;
		int aniosH = 20;
		
		// Datos Correctos
		Hombre h1 = new Hombre(pesoH, alturaH, aniosH);
		
		System.out.println("Hombre Con datos correctos");
		System.out.println(h1.calcularMTB());
		
		double alturaH2 = 190;
		double pesoH2 = 200;
		int aniosH2 = 20;
		
		// Datos incorrectos
		Mujer h2 = new Mujer(pesoH2, alturaH2, aniosH2);
		
		System.out.println("Hombre Con datos correctos");
		System.out.println(h2.calcularMTB());
	}
}
