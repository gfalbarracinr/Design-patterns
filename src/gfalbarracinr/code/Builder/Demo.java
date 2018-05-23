package gfalbarracinr.code.Builder;

public class Demo {

	
	public static void main (String [] args) {
		
		Waiter waiter = new Waiter();
		PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
		
		waiter.setPizzaBuilder(hawaiianPizzaBuilder);
		waiter.constructPizza();
		
		Pizza pizza = waiter.getPizza();
	}
}
