import java.util.Scanner;

public class Ejercicio13{

	public static void main(String[] args) {
		String opcion = "";
		while (!(opcion.equals("c"))) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("\na.Sumar\nb.Dividir\nc.Salir");
			opcion = String.valueOf(scanner.nextLine());
			if (opcion.equals("a")) {
				System.out.println("\nIngresa el número a sumar");
				int num1 = scanner.nextInt();
				System.out.println("\nIngresa el otro número a sumar");
				int num2 = scanner.nextInt();
				int suma = num2 + num1;
				System.out.println("\nEl resultado es " + suma);
			} else if (opcion.equals("b")) {
				System.out.println("\nIngresa el dividendo");
				double num1 = scanner.nextDouble();
				System.out.println("\nIngresa el divisor");
				double num2 = scanner.nextDouble();
				if (num2 != 0) {
					double division = num1/num2;
					System.out.println("\nEl resultado de la division es " + division);
				} else{
					System.out.println("\nEl dividendo no puede ser 0");
				}
			}
		} 
	}
}