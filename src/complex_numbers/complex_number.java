package complex_numbers;

public class complex_number {
	double real;
	double imaginary;
	public complex_number(double a, double b){
		real=a;
		imaginary=b;
	}
	public static complex_number product(complex_number a, complex_number b){
		complex_number c=new complex_number((a.imaginary*b.real)+(b.imaginary*a.real),(a.real*b.real)-(a.imaginary*b.imaginary));
		return c;
	}
	public static complex_number sum(complex_number a, complex_number b){
		complex_number c=new complex_number(a.real+b.real,a.imaginary+b.imaginary);
		return c;
	}
}
