package gfalbarracinr.code.Proxy;

public class Demo {
	public static void main (String [] args) {
		Image image = new ProxyImage("prueba.jpg");
		
		image.display();
		System.out.println();
		
		image.display();
	}
}
