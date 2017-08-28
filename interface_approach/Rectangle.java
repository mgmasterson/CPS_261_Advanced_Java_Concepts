package interface_approach;
/**
 * @author Michael Masterson
 * CPS 261
 * 
 * Using interface approach
 */
public class Rectangle implements Shape
{
	double length;
	double width;

	public Rectangle (double l, double w)
	{
		this.length = l;
		this.width = w;
	}
	public double getPerimeter()
	{
		return 2.0*(this.width + this.length);
	}

	public double getAPRatio()
	{
		return getArea()/getPerimeter();
	}

	public double getArea()
	{
		return this.length * this.width;
	}
}