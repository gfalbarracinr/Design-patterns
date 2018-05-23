package gfalbarracinr.code.Builder;

public class Pizza {
	
	public Pizza() {
		this.dough = new String();
		this.sauce = new String();
		this.topping = new String();
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public void setDough(String dough) {
		this.dough = dough;
	}
	private String topping;
	private String sauce; 
	private String dough;
}
