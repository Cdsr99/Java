package cdsr99.com.github.Figura_Geometrica.classes;

public class Triangulo implements FiguraGeometrica {
	
	private Float lado1;
	private Float lado2;
	private Float lado3;
	
	@Override
	public Float CalcularArea() {
		// TODO Auto-generated method stub
		Float area = this.lado1 + this.lado2 + this.lado3;
		return area;
	}
	@Override
	public Float CalcularPerimetro() {
		// TODO Auto-generated method stub
		return null;
	}

	
	// Getters and Setters
	
	public Float getLado1() {
		return lado1;
	}
	public void setLado1(Float lado1) {
		this.lado1 = lado1;
	}
	public Float getLado2() {
		return lado2;
	}
	public void setLado2(Float lado2) {
		this.lado2 = lado2;
	}
	public Float getLado3() {
		return lado3;
	}
	public void setLado3(Float lado3) {
		this.lado3 = lado3;
	}
	

	


	}


