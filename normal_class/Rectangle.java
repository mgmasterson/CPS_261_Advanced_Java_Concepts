package normal_class;
/**
 * @author Michael Masterson
 * CPS 261
 * 
 * Using normal class
 */
public class Rectangle extends Shape
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

