package normal_class;
/**
 * @author Michael Masterson
 * CPS 261
 * 
 * Using normal class
 */
public class Square extends Shape
{
	double side=0;
	double area =0;
	double perimeter =0;

	public Square(double side) 
	{
		this.side = side;
	}

	public double getArea()
	{
		area = side*side;
		return area;
	}
	public double getPerimeter()
	{
		perimeter = 4* side;
		return perimeter;
	}
	public double getAPRatio()
	{
		return getArea()/getPerimeter();
	}
}
