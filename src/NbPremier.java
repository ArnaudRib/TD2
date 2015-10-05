//Question 3.3
import java.util.Scanner;

public class NbPremier {
	public static void main(String[] args) {
		double nb,res=1, test;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre ˆ tester?");
		nb=sc.nextDouble();
		test=nb-1;
		while (test>1){
			if (nb%test==0){
				res=0;
			}
			test=test-1;
		}
		if (res==1)
			System.out.print(nb+" est premier.");
		if (res==0)
			System.out.print(nb+" n'est pas premier.");
	}

}
