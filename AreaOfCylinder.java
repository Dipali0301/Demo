import java.util.Scanner;
class AreaOfCylinder
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the cylinder(cm): ");
		double radius = sc.nextDouble();

		System.out.println("Enter the height of the cylinder(cm): ");
		double height = sc.nextDouble();

		final double pi = 22/7;
		
		// Calculate the area and volume of cylinder
		
		double area = pi*(radius*radius);

		double volume = area*height;

		System.out.println("the area of cylinder is :" +area);
		System.out.println("the volume of cylinder is :" +volume);

	}
}