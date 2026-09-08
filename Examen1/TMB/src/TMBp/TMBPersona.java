package TMBp;

public abstract class TMBPersona {
	
	private double pesoEnKilos;
	private double alturaEnCentimetros;
	private int edadEnAnios;
	
	TMBPersona(double pesoEnKilos, double alturaEnCentimetros, int edadEnAnios){
		this.setPesoEnKilos(pesoEnKilos);
		this.setAlturaEnCentimetros(alturaEnCentimetros);
		this.setEdadEnAnios(edadEnAnios);
		
	}

	public double getPesoEnKilos() {
		return pesoEnKilos;
	}

	public void setPesoEnKilos(double pesoEnKilos) {
		this.pesoEnKilos = pesoEnKilos;
	}

	public double getAlturaEnCentimetros() {
		return alturaEnCentimetros;
	}

	public void setAlturaEnCentimetros(double alturaEnCentimetros) {
		this.alturaEnCentimetros = alturaEnCentimetros;
	}

	public int getEdadEnAnios() {
		return edadEnAnios;
	}

	public void setEdadEnAnios(int edadEnAnios) {
		this.edadEnAnios = edadEnAnios;
	}
	
	public abstract boolean condicciones();
	
	public abstract double calcularMTB();
	
}
