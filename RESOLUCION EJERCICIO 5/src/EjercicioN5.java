import java.util.Scanner;
public class EjercicioN5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		System.out.print("Ingrese una cadena de texto, porfavor: ");
		
		String sPalabra=lector.nextLine();
		int inc = 0;
		int des = sPalabra.length()-1;
		boolean bError = false;
		while ((inc<des) && (!bError)){
			 
			if (sPalabra.charAt(inc)==sPalabra.charAt(des)){				
				inc++;
				des--;
			} else {
				bError = true;
			}
		}
		if (!bError)
			System.out.println(sPalabra + " Es  PALINDROMO");
		else
			System.out.println(sPalabra + " No es palindromo");
	}

}
