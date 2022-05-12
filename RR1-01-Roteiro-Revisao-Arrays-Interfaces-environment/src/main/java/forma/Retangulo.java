package forma;

public class Retangulo implements Forma {
	
	private double comprimento;
	private double altura;
	
	public Retangulo(double base, double altura) {
		super();
		this.comprimento = base;
		this.altura = altura;
	}

	@Override
	public double getArea() {
		double area;
		area = comprimento * altura;
		return area;
	}

}
