public class FloresDoMar{
	/*

	Verificar se Timmy e Sarah estão apaixonados.
	Retornar True se uma flor tiver número par de pétalas e a outra número impar

*/
	public static boolean islove(final int flor1, int final flor2){
		// Se a paridade for diferente (um par e outro ímpar), o resultado é true

		return flor1 % 2 != flor2 % 2;

	
	}

	public static void main(String[] args){
			System.out.println(islove(1, 4));
			System.out.println(islove(2, 2));
			System.out.println(islove(0, 1));

	}
	}


/*

return (flor1 + flor2) % 2 !=0;

return (flor1 % 2)^(flor2 % 2) == 1;


*/
