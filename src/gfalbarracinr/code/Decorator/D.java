package gfalbarracinr.code.Decorator;

public abstract class D implements I {
	
	public D (I inner) {
		core = inner;
	}
	
	@Override
	public void doIt() {
		core.doIt();

	}

	private I core;
}
