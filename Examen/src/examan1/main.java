package examan1;
import java.util. Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class main {
	static Scanner entrada;
	public static void main(String[] args) {
		entrada= new Scanner (System.in);
		Scanner sc= new Scanner(System.in);
		Scanner frase = new Scanner(System.in);
		Scanner frase2 = new Scanner(System.in);
		int opc;
		System.out.println("Ingrese una opcion:\n 1.- primera mayuscula de un string \n 2.- Invertir una cadena (si selecciona esta opcion escriba la palabra a invertir) \n 3.-Vocales en mayúsculas \n 4.- Fizzbuzz \n 5.- Palíndromo");
		opc = entrada.nextInt();	
		switch(opc) {
		case 1:
			 {
			      String str = "anita lava la tina de noche";
			      System.out.println(str);
			      StringBuffer strbf = new StringBuffer();
			      Matcher match = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(str);
			      while(match.find()) 
			      {
			         match.appendReplacement(strbf, match.group(1).toUpperCase() + match.group(2).toLowerCase());
			      }
			      System.out.println(match.appendTail(strbf).toString());
			  }
		break;
		case 2:
			String texto= sc.nextLine();
			String palabra= "";
			for(int i = texto.length()-1; i>=0; i--) {
				palabra += texto.charAt(i);
			}
			System.out.println(palabra);
		break;
		case 3:
			System.out.println("Ingrese una palabra: ");
            String vocal= frase.nextLine();
            String[] nombres = {vocal};
            for (int i = 0; i < nombres.length; i++){
            	 nombres[i] = nombres[i].toLowerCase().replace("a", "A").replace("e", "E").replace("i", "I").replace("o", "O").replace("u", "U");
         	    System.out.println(nombres[i]);
         	    }
            
		break;
		case 4:
			int n=0;
			while (n++<=99) {
				System.out.println(+n);
				
				if (n%5==0 && n%3==0) {
					System.out.println("FizzBuzz" );
					
				} else if (n%3==0) {				
					System.out.println("Fizz" );
					
				}
				else if (n%5==0) {
					System.out.println("Buzz" );
					
				}
			
			}
		break;
		case 5:
			
			System.out.println("Ingrese una palabra: ");
            String pal= frase2.nextLine();
           
            pal = pal.toLowerCase();
            
           for (int i=0, p = pal.length() - 1; i <= p; i++) {
        	   if (pal.charAt(i) ==pal.charAt(pal.length()-1-i)) {
        		   System.out.println("Si es palindromo");
        		   
        	   } if (pal.charAt(i) !=pal.charAt(pal.length()-1-i)) {
        		   System.out.println("No es palindromo");
        	   } break;
            }
      
		break;
		
		}
		}
}
