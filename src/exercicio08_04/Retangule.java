package exercicio08_04;

public final class Retangule {
	
	private float length = 1.0f;
	private float width = 1.0f;
	
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		if(length > 0.0 && length < 20.0) {
			this.length = length;
		}else {
			System.out.println("length deve ser maior do que 0 e menor que 20.");
		}
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		if(width > 0.0 && width < 20.0) {
			this.length = width;
		}else {
			System.out.println("width deve ser maior do que 0 e menor que 20.");
		}
	}

}//class
