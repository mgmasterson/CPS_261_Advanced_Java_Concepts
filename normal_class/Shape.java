package normal_class;
/**
 * @author Michael Masterson
 * CPS 261
 * 
 * Using normal class
 */
public  class Shape {
	public double getArea()
	{
		System.out.println("Shape.getArea(): Dumb thing to do from Shape class");
		return -1.0;
	}
	public double getPerimeter()
	{
		System.out.println("Shape.getPerimeter(): Dumb thing to do from Shape class");
		return -1.0;
	}
	public double getAPRatio()
	{
		return getArea()/getPerimeter();
	}
}