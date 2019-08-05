import java.util.Scanner;

public class calculadoraSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hacemos la prueba de entrada por teclado
		
		//Declaramos la variable para la entrada por teclado
		Scanner teclado= new Scanner(System.in);
		
		float numero1 = -1;
		float numero2 = -1;
		float resultado = -1;
		String operacion1 = "";
		String operacion2 = "";
		boolean continuar = true;
		boolean operadorValido = true;
		String tecla = "";
		
		
		do
		{
			//Comenzamos el programa

			System.out.println("Programa \"Calculadora\"");
			
			System.out.println("Vamos a realizar una operaci�n matem�tica.");
			
			//Pedimos los n�meros y el tipo de operaci�n al usuario
			
			//Pedimos el primer n�mero
			System.out.println("Introduzca el primer n�mero: ");
			numero1 = teclado.nextFloat();
			teclado.nextLine();
			
			do
			{
				//Pedimos la operacion1
				System.out.println("Introduzca el operador: (+,-,*,/)");
				operacion1 = teclado.nextLine();
				
				//Comprobamos si la operaci�n es correcta, sino la volvemos a pedir.
				if(!(operacion1.equals("+") || operacion1.equals("-") || operacion1.equals("*") || operacion1.equals("/")))
				{
					System.out.println("El operador que has introducido no es v�lido");
					operadorValido=false;
				}
				else
					operadorValido=true;
			}while(operadorValido==false);
			
			do
			{
				//Realizamos la petici�n de operadores y n�meros hasta que el usuario
				//inserte por teclado el s�mbolo '='.
				
				//Pedimos otro n�mero
				System.out.println("Introduzca otro n�mero: ");
				numero2 = teclado.nextFloat();
				teclado.nextLine();

				//Comprobamos el operador 2
				do
				{
					//Pedimos la operacion2
					System.out.println("Introduce la siguiente operaci�n: (+,-,*,/), Introduzca '=' para mostrar el resultado.");
					operacion2 = teclado.nextLine();
				
					//Comprobamos si la operaci�n es correcta, sino la volvemos a pedir.
					if(!(operacion2.equals("+") || operacion2.equals("-") || operacion2.equals("*") || operacion2.equals("/") || operacion2.equals("=")))
					{
						System.out.println("El operador que has introducido no es v�lido");
						operadorValido=false;
					}
					else
						operadorValido=true;
				}while(operadorValido==false);
			
				switch(operacion1)
				{
					case "+":
						resultado = numero1+numero2;
						break;
					case "-":
						resultado = numero1-numero2;
						break;
					case "*":
						resultado = numero1*numero2;
						break;
					case "/":
						//Realizamos la validaci�n del divisor que sea distinto a cero.
						if(numero2!=0) //comprobamos que el numero2 sea distinto a 0
						{
							resultado = numero1/numero2;
						}
						else
						{
							System.out.println("Error: no se puede dividir por 0");
							System.out.println("Error: no se puede dividir por " + numero2 + ", so burro");
						}
						break;
					case "=":
						break;
					default:
						System.out.println("El operador que has introducido no es v�lido");
				}
				
				//Reasignamos las variables para seguir operando con el siguiente operador
				numero1=resultado;
				operacion1=operacion2;
		
			}while (!operacion2.equals("="));
			
			//Mostramos por pantalla el resultado de la operaci�n
			System.out.println("El resultado de la operaci�n es: " + resultado);
			
			do
			{
				//Preguntamos al usuario si desea introducir mas c�lculos y en caso afirmativo volvemos a empezar. 
				System.out.println("\n\n�Desea realizar otra operaci�n? (S/N)");
				tecla=teclado.nextLine();
				
				switch(tecla)
				{
				case "n":
				case "N":
					continuar = false;
					break;
				case "s":
				case "S":
					break;
				default:
					System.out.println("Lo siento, has introducido algo no v�lido, vuelva a intentarlo: ");
				}
			}while(!(tecla.equals("n") || tecla.equals("N") || tecla.equals("s") || tecla.equals("S")));
		}while(continuar);
		
		//Cerramos el programa.
		System.out.println("FIN DE CALCULADORA");
	}
}