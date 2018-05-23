package gfalbarracinr.code.Builder;

public abstract class PizzaBuilder {
	public Pizza getPizza() {
		return pizza;
	}
	public void createNewPizzaProduct() {
		pizza = new Pizza();
	}
	
	public abstract void buildDough();
	public abstract void buildSauce();
	public abstract void buildTopping();
	
	
	protected Pizza pizza;
}
