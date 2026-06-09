public class TrabalhoEscolar{

	/*
	Calcular a quantidade de páginas em branco necessárias baseando-se no número d ecípias e de folhas por cópia.
	
	@param n O número de colegas de classe (pode receber valores negativos)
	@param m O número de páginas de trabalho escolar (pode receber valores negativos)
	@return O total de páginas necessárias para todos os colegas, ou O caso as entradas sejam inválidas (menores que zero)
	

	*/

	public int trabalho(int n, int m){
		
	//1. Validar se alguma das variáveis de entrada é negativa
	// Se houver quantidade de pessoas ou de páginas menor que zero, a operação é considerada inválida e retorna 0
	if(n < 0 || m < 0){
		return 0;
	}

	//2. Se as entradas forem válidas, calcular a multiplicação simpes entre as pessoas e as páginas 
	return n * m;
		
	}


	}
