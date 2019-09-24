package complex_numbers;

import javax.swing.JFrame;

public class mandelbrot extends JFrame{
	
	public mandelbrot() {
		setSize(1500, 1000);
		setVisible(true);
	}
	public boolean inboundaries(complex_number a){
		double distance= a.imaginary*a.imaginary+a.real*a.real;
		return distance<=4;
	}
}
