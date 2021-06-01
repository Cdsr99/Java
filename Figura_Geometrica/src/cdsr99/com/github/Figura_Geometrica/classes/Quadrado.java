package cdsr99.com.github.Figura_Geometrica.classes;

public class Quadrado implements FiguraGeometrica {
	
	private Float l1;
	private Float l2;
	
	public Float getL1() {
		return l1;
	}
	public void setL1(Float l1) {
		this.l1 = l1;
	}
	public Float getL2() {
		return l2;
	}
	public void setL2(Float l2) {
		this.l2 = l2;
	}
	
	@Override
	public Float CalcularArea() {
		// TODO Auto-generated method stub
		Float area = l1 * l1;
		return area;
	}
	@Override
	public Float CalcularPerimetro() {
		// TODO Auto-generated method stub
		Float Perimeter = this.l1 * 4 ;
		return Perimeter;
	}
	
	
	
}
