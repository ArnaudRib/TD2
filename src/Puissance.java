//Question 3.2.
import java.util.Scanner;

public class Puissance {
	public static void main(String[] args) {
		double a,b, puissance;
		Scanner sc = new Scanner(System.in);
		System.out.println("De la forme a^n.");
		System.out.print("Valeur de a? ");
		a=sc.nextDouble();
		System.out.print("Valeur de b? ");
		b=sc.nextDouble();
		puissance=Math.pow(a, b);
		System.out.print("La valeur de a^n est "+puissance +".");
	}
}
