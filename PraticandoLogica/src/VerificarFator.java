public class VerificarFator{
		
		/*
		Verificar se o parÂmetro factor divide o parametro base de forma exata
	@param base O número divisor que será testado (número inteiro não-negativo)
	@param factor O número divisor que será testado (número inteiro positivo
	@return true se o resto da divisão for zero (é fator). false caso contrário

		

	*/

	public boolean  verificacaoDeFator(int base, int factor){
	//O operador modulo (%) calcula o resto da divisão inteira de base por factor
	// Se o resultado for extamente igual a 0. significa que o número é um fator.
	
	return base % factor == 0;
		
	
}
		


	}
