package TMBp;

public class Mujer extends TMBPersona {
	
	public Mujer(double pesoEnKilos, double alturaEnCentimetros, int edadEnAnios) {
		super(pesoEnKilos, alturaEnCentimetros, edadEnAnios);
	}

	@Override
	public boolean condicciones() {
		
		if(  	this.getPesoEnKilos() >= 40
				&& this.getPesoEnKilos() <= 80
				&& this.getAlturaEnCentimetros() >= 140
				&& this.getAlturaEnCentimetros() <= 180
				&& this.getEdadEnAnios() > 15){
			
			return true;
			
		}
		return false;
	}

	@Override
	public double calcularMTB() {
		
		// si no cumple la condiccion por defecto retorna 0
		
		if (condicciones()) {
			return 447.593 + (9.247 * this.getPesoEnKilos()) + 
				(3.098 * this.getAlturaEnCentimetros()) - 
				(4.33 * this.getEdadEnAnios());
		}else {
			return 0;
		}
	}

}
