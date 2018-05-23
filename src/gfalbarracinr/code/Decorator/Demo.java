package gfalbarracinr.code.Decorator;

public class Demo {

	public static void main (String [] args) {
		I[] array = {new X(new A()), new Y(new X(new A())), new Z(new Y(new X(new A())))};
		for (I element : array) {
			element.doIt();
			System.out.println(" ");
		}
	}

}
