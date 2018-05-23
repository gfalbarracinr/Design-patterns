package gfalbarracinr.code.Builder;

public class Waiter {

	
	public void constructPizza() {
		
		pizzaBuilder.createNewPizzaProduct();
		pizzaBuilder.buildDough();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildTopping();
	}
	
	public void setPizzaBuilder (PizzaBuilder pb) {
		pizzaBuilder = pb;
	}
	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}
	private PizzaBuilder pizzaBuilder;
}
