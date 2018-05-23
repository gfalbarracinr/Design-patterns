package gfalbarracinr.code.Decorator;

public class Z extends D {

	public Z(I inner) {
		super(inner);
	}
	public void doIt() {
		super.doIt();
		doZ();
	}
	
	public void doZ() {
		System.out.print('Z');
		
	}
	
}
