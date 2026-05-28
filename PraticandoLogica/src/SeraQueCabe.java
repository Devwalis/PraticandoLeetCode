public class SeraQueCabe{
/*
	Calcular quantos passageiros BOb não conseguira levar em seu onibus
	

	@param cap A capacidade total do onibus (excluindo o motorista).
	@param on O número do passageiros já no ônibus (excluindo o motorista).
	@param weit O número de passageiros esperando para entrar(excluindo o motorista).

	@return O se houver espaço suficiente, ou o número de passageiros que não cabem.



*/


	public int enoug(int cap, int on, int wait){
	
	// Calcular o número total de pessoas querem estar no onibus
	int totalPassageiroEmBordo = on + wait;
	
	//calcula o número de pessoas que excedem a capacidade

	int passageiroCapacidade = totalPassageiroEmBordo - cap;

	//Se passageiroCapacidade for negativo ou zero significa que todos cabem,
	// então retornamo 0. caso contrario, retornamos o número d epassageiros que não cabem.

	return Math.max(0, passageiroCapacidade);

	/*
	Usando if-else
	
	int 

	*/	



	}
}
