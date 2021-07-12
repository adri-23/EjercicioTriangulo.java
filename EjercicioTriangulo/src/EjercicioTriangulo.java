import java.util.Scanner;

public class EjercicioTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Crear un programa donde se introduzcan 
		 * los tres ángulos internos de un triángulo y 
		 * se determine si el triángulo es válido o no.
		 */

		Scanner ingresar= new Scanner(System.in);
		System.out.println("primer amgulo interno");
		int angulo1=ingresar.nextInt();
		System.out.println("segundo angulo interno");
		int angulo2=ingresar.nextInt();
		System.out.println("tercer angulo interno");
		int angulo3=ingresar.nextInt();
		int triangulo = angulo1 + angulo2 + angulo3;
		
		hola(triangulo);
	} 
	private static void hola(int triangulo) {
		if (triangulo ==180) {
			System.out.println("el angulo es valido");
		} else {
			System.out.println("el angulo es invalido");
		}
		

	}

}
