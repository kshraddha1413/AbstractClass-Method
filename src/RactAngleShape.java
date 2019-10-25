
public class RactAngleShape extends Shape{
	
	double length;
	double hight;
	
	public RactAngleShape(String color, double length, double hight) {
		super(color);
		this.length = length;
		this.hight = hight;
	}

	@Override
	public double area() {
		double area=length*hight;
		return area;
	}

	@Override
	public String toString() {
		
		return "colour of ractangle "+super.color + "area of rectangle :" + area();
	}

}
