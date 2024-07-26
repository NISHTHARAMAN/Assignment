package getterandsetter;

public class Complex {
	
	private double realPart;
    private double imaginaryPart;
	
    public Complex() {
		this.realPart = 0;
		this.imaginaryPart = 0;
	}
	public Complex(double realPart, double imaginaryPart) {

		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	public Complex add(Complex secondno) {
		return new Complex (this.realPart + secondno.realPart , this.imaginaryPart + secondno.imaginaryPart);
	}
	
	public Complex subtract(Complex secondno) {
		return new Complex (this.realPart - secondno.realPart , this.imaginaryPart - secondno.imaginaryPart);
	}
	
	public Complex multiply(Complex secondno) {
		return new Complex (this.realPart * secondno.realPart - this.imaginaryPart * secondno.imaginaryPart , this.realPart * secondno.imaginaryPart + this.imaginaryPart * secondno.realPart);
	}
	
	public Complex divide(Complex secondno) {
		double denominator = secondno.realPart * secondno.realPart + secondno.imaginaryPart * secondno.imaginaryPart;
		double real = (this.realPart * secondno.realPart + this.imaginaryPart * secondno.imaginaryPart)/denominator;
		double imaginary = (this.imaginaryPart * secondno.realPart - this.realPart * secondno.imaginaryPart)/denominator;
		return new Complex (real,imaginary);
	}
	
	
	public double getRealPart() {
		return realPart;
	}
	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}
	public double getImaginaryPart() {
		return imaginaryPart;
	}
	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	@Override
	public String toString() {
		if(imaginaryPart<0) {
			return "" + realPart + " - " + Math.abs(imaginaryPart) + "i";
			
		}
		return "" + realPart + " + " + "i" + imaginaryPart ;
	}
	
	
    
    

}
