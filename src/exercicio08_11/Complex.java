package exercicio08_11;

public final class Complex {
	
	private double realpart = 0;
	private double imgpart = 0;
	
	
	public Complex(double realpart, double imgpart) {
		setRealpart(realpart);
		setImgpart(imgpart);
	}
	
	public Complex() {
		setRealpart(1);
		setImgpart(1);
	}

	public double getRealpart() {
		return realpart;
	}

	public void setRealpart(double realpart) {
		this.realpart = realpart;
	}

	public double getImgpart() {
		return imgpart;
	}

	public void setImgpart(double imgpart) {
		this.imgpart = imgpart;
	}
	

	public static Complex sumComplex(Complex num1, Complex num2) {
		return new Complex((num1.getRealpart() + num2.getRealpart()), (num1.getImgpart() + num2.getImgpart()));
	}
	
	public static Complex difComplex(Complex num1, Complex num2) {
		return new Complex((num1.getRealpart() - num2.getRealpart()), (num1.getImgpart() - num2.getImgpart()));
	}
	
	// convert to string
    public String toString(){
        return String.format("(%.2f, %.2f)", getRealpart(), getImgpart());
    }

}//class
