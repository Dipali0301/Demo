import java.util.Scanner;
class Alphabet 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Character");
		char ch = sc.next().charAt(0);

		String op = ((ch>='A' && ch<='Z' || ch>='a' && ch<='z')) ?  ((ch>='a' && ch<='z') ? (ch+ "is a LowerCase Alphabet") : (ch+ "is an UpperCsae Alphabet")): ((ch>='0' && ch<='9')? (ch+ "is a Digit") : (ch+ "is a Special Character"));
			 
			 System.out.println(op);
			}
}
