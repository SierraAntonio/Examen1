package examan1;

public class invertircadena {
	
    String[] names = { "Casa", "Perro", "Bicicleta", "Carro", "Gato", "Puerta" };

	for (int i=0; i< names.length;i++)
	{
	    names[i] = names[i].toLowerCase().replace("a", "A").replace("e", "E").replace("i", "I").replace("o", "O").replace("u", "U");
	    System.out.println(names[i]);}
	
}
