import java.util.Arrays;
import java.util.Scanner;
public class EjercicioN6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		
		 int i,j,temp,producto;
		 System.out.print("Introduzca la cantidad de datos : ");
		 int n=lector.nextInt();
	        int[] numeros = new int[n];
	       
	        	        for(i=0; i<numeros.length; i++)
	        {
	            System.out.printf("Introduzca número %d: ", i+1);
	            numeros[i] = lector.nextInt();
	        }

	        for(i=0; i<numeros.length; i++){
	            System.out.println(numeros[i]);
	            
	  	}Arrays.sort(numeros);
	  	producto=numeros[n-1]*numeros[n-2]*numeros[n-3]*numeros[n-4];
		  System.out.println(Arrays.toString(numeros));
		  System.out.println(producto);
	}

}
