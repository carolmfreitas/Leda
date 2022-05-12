package forma;

public class Quadrado implements Forma {
	
	private double lado;
	
	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}
	
	@Override
	public double getArea() {
		double area = lado * lado;
		return area;
	}

}
