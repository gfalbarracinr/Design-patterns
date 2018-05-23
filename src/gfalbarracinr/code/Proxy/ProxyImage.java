package gfalbarracinr.code.Proxy;

public class ProxyImage implements Image{

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void display() {
		if (realImage == null) 
			realImage = new RealImage(fileName);
		realImage.display();
		
	}
	private RealImage realImage;
	private String fileName;
}
