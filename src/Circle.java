
public class Circle extends Shape{
	double radius;

	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double area() {
		double area=Math.PI*radius*radius;
		return area;
	}

	@Override
	public String toString() {
		return "circle color is:"+super.color+ "area of circle :" + area();
		
	}
	

}
