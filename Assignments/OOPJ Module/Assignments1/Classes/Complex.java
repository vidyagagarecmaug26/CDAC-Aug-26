
public class Complex {
	int real;
	int img;
	
	public Complex(int real,int img) {
		this.real=real;
		this.img=img;
		
	}
	public Complex sum(Complex other) {
		return new Complex(this.real + other.real, this.img+other.img);
	}
	public Complex difference(Complex other){
		return new Complex(this.real - other.real, this.img - other.img);
	}
	
	public Complex product(Complex other){
		int newReal=(this.real * other.real) - (this.img * other.img);
		int newImg=(this.real * other.img) + (this.img * other.real);
		return new Complex(newReal,newImg);
	}
}
