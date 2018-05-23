package gfalbarracinr.code.Decorator;

public class X extends D {

	public X(I inner) {
		super(inner);
	}
	public void doIt() {
		super.doIt();
		doX();
	}
	
	public void doX() {
		System.out.print('X');
		
	}
	
	
}
