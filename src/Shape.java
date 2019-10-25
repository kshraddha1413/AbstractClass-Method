
public abstract class Shape {
	String color;

	public Shape(String color) {
		
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	public abstract double area();
	public abstract String toString();
	

}
