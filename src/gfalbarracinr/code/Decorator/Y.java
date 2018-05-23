package gfalbarracinr.code.Decorator;

public class Y extends D {

	public Y(I inner) {
		super(inner);
	}
	public void doIt() {
		super.doIt();
		doY();
	}
	
	public void doY() {
		System.out.print('Y');
		
	}
	
	
}
