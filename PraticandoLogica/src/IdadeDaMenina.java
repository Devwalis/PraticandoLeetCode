public class IdadeDaMenina{
	
	/*
	Extrai a idade de uma string no formato "x years old" ou "x uear olf"

	@param Frase A string de entrada que contém a idade.
	@return A idade da menina como um inteiro (0-9)
	@throws IllegalArgumentException se a string não começar com o dígito.

	
	*/


	public int extrairIdade(String frase){
		
		if(frase == null || frase.isEmpty()){
			throw new IllegalArgumentException("A frase não pode ser nula ou vazia");

		}
	
		char primeiroCaractere = frase.charAt(0);
		return Character.getNumericValue(primeiroCaractere);

	}	

}
