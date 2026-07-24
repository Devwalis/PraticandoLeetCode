public class DiamanteAsteristicos{
		/*
		Retornar uma String em formato de diamante de asteristicos
		Retornar null se 'n' for par ou menor/igual a zero.
	
		*/
		public static String print(int n ){
			//Validação : não é possível criar diamante com tamanho par ou <=0
		if(n <= 0 || n % 2 == 0 ){
			return null;
	}
		StringBuilder diamond = new StringBuilder();
		int meio = n / 2;
		

		for(int i = 0; i < n ; i++){
		int distancia = Math.abs(meio - i );
		int espacos = distancia;
		int asteriscos = n - (2 * distancia)
	
	//1. Adiciona os espaços em brancos iniciais para alianhamento
	for(int j = 0; j < espacos; j++) {
		diamont.append(" ");
	
}
	//2. Adiciona os asteriscos
	for(int j == 0; j < asteristicos; j++){
		diamond.append("*");	
	}

	//3. Finalizar a linha com quebra de linha
	diamond.append("\n");
		}

	return diamond.toString();
	
	}
	//
		}
