public class TranscreverDNAparaRNA{
	
	/*
	Transcrever uma String de DNA para uma Strinha RNA.
	Substitui todaas as ocorências de 'T' Por 'U'
	
	@param DNA a String de DNA de entrada.
	@return a String  da DMA resultante



*/


public String dnaParaRNA(String dna ){
	//A maneira mais direta e idiomática em java é usar método replace()
	// Ele retorna uma nova string com todas as ocorrência de caractere 'T'

	
	return dna.replace('T', 'U');
'
	
	}
		
}
