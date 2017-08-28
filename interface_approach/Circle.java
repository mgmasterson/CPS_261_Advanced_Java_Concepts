package interface_approach;
/**
 * @author Michael Masterson
 * CPS 261
 * 
 * Using interface approach
 */
public class Circle implements Shape
{
	double radius;

	public Circle(double radius) 
	{
		this.radius = radius;
	}
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
	public double getPerimeter()
	{
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	public double getAPRatio()
	{
		return getArea()/getPerimeter();
	}
}