//Question 3.4.
import java.util.Scanner;

public class TableNoTab {

	public static void main(String[] args) {
		int nb, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre maximal de la table?");
		nb=sc.nextInt();
		for (i=0; i<nb+1;i++){
			for (j=0; j<nb+1;j++){
				if (i*j>=10 && i*j<100) //tant que i*j est � 2 chiffres, mettre 3 espace. Cela �vite les d�callages.
					System.out.print(i*j+"   ");
				if (i*j>=100 && i*j<1000)
					System.out.print(i*j+"  ");
				if (i*j>=1000)
					System.out.print(i*j+" "); //enleve un espace si 1000 est d�pass�. Alignement valable pour une valeur max de 10000.
				if (i*j<10)
					System.out.print(i*j+"    ");
			}
		System.out.println("");
		}
	}
}
