public class TransporteNasFerias{
	
	/*
	Calcular o custo total do aluguel de um carro considerando taxas diárias e descontos  específicos por duração.
	@param d A quantidade de dias que o carro será alugado (número inteiro não-negativo)
	@return O custo total do aluguel em dólares, com os descontos aplicados
	
	
	*/


	public int taxaDoDiaCarro(int d){
	
	
	// 1. Calcular o custo base multiplicando o total de dias de aluguel por 40 dólares
	int CustoBase = d * 40;
	

	// 2. Aplicar as regras condicionais de descontos com base no volume de dias contratados
	if(d >= 7){
	return CustoBase - 50;

	} else if(d >= 3){
	//Desconto de 20 dólares para aluguel entre 3 e 6 dias 
		return custoBase -20;		
} 	else{
	// Nenhum desconto aplicado para períodos menores que 3 dias 
		return custoBase;
	
	}
	}
	
	
}

