import java.util.Scanner;
class AreaOfCircle2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius(cm): ");
		double radius = sc.nextDouble();
		final double pi = 22/7;
		double area = pi*(radius*radius);

		System.out.println("the area of circle is :" +area+ "cm^2");

		
	}
}
