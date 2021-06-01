package cdsr99.com.github.Figura_Geometrica.classes;

public class Retangulo implements FiguraGeometrica{
	
		private Float w;
		private Float l;
		
		public Float getW() {
			return w;
		}
		public void setW(Float w) {
			this.w = w;
		}
		public Float getL() {
			return l;
		}
		public void setL(Float l) {
			this.l = l;
		}
		@Override
		public Float CalcularArea() {
			// TODO Auto-generated method stub
			Float area = this.getW() * this.getL();
			return area;
		}
		@Override
		public Float CalcularPerimetro() {
			// TODO Auto-generated method stub
			Float p = 2 * (this.getW() + this.getL()); 
			return p;
		}
	
		
}
