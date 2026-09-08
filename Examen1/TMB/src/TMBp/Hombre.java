package TMBp;

public class Hombre extends TMBPersona {
	
	public Hombre(double pesoEnKilos, double alturaEnCentimetros, int edadEnAnios) {
		super(pesoEnKilos, alturaEnCentimetros, edadEnAnios);
	}

	@Override
	public boolean condicciones() {
		
		if(  	this.getPesoEnKilos() >= 60 
				|| this.getPesoEnKilos() <= 110
				|| this.getAlturaEnCentimetros() >= 160 
				|| this.getAlturaEnCentimetros() <= 195
				|| this.getEdadEnAnios() > 15){
			
			return true;
			
		}
		return false;
	}

	@Override
	public double calcularMTB() {
		
		// si no cumple la condiccion por defecto retorna 0
		
		if (condicciones()) {
		return 88.362 + (13.397 * this.getPesoEnKilos()) + 
				(4.799 * this.getAlturaEnCentimetros()) - 
				(5.677 * this.getEdadEnAnios()) ;
		}else {
			return 0;
		}
	}

}
