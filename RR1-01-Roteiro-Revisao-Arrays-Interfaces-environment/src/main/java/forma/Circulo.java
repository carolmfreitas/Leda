package forma;

public class Circulo implements Forma {
	
	private double raio;
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double getArea() {
		double area;
		area = Math.PI * raio * raio;
		return area;
	}

}
