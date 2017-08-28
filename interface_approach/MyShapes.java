package interface_approach;
/**
 * @author Michael Masterson
 * CPS 261
 * 
 * Using interface approach
 */
class MyShapes
{
	public static void main(String[] args)
	{
		Shape[] myShapes= new Shape[3];

		myShapes[0] = new Circle(18.0);
		myShapes[1] = new Rectangle(12.0, 32.0);
		myShapes[2] = new Square(41.0);

		for (int i=0; i < myShapes.length; i++)
		{
			System.out.println("Info for shape " + i + " = ");
			System.out.println("Perimeter= " + myShapes[i].getPerimeter());
			System.out.println("Area= " + myShapes[i].getArea());
			System.out.println("APRatio= " + myShapes[i].getAPRatio());
		}
	}
}