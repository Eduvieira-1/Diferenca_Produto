import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d;
		double diferenca;
		
		
		System.out.println("Informe o primeiro valor:");
		a = sc.nextInt();
		System.out.println("Informe o segundo valor:");
		b = sc.nextInt();
		System.out.println("Informe o terceiro valor:");
		c = sc.nextInt();
		System.out.println("Informe o quarto valor:");
		d = sc.nextInt();
		

		diferenca = (a * b - c * d);
		
		System.out.println("O valor da diferença é: " + diferenca);
		
		
		sc.close();

	}

}
