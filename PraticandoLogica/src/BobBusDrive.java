public class BobBusDriver{

/*
Calcula se bob consegue acomodar todos os passageiros no ônibus
@param cap A capacidade total de pessoas que o onibus pode comportar(excluindo o motorista)
@param on O número de pessoas ja no ônibus (excluindo o motorista).
@param wait O número de pessoas esperando para entrar no ônibus (excluindo o motorista
@return 0 se houver espaço suficiente para todos; caso contrário, retorna o número de passageiros que ele não pode levar.*/

public int enough(int cap, int on, int wait){
	int totalPassagers = on + wait; //pessoas que precisa de espaço

	if(totalPassagers <= cap){
		return 0; //Há espaço para todos
	
	}elese{
		return totalPassagers - cap; //Retorna o número de pessoas  que não cabem

	}

	//Alternativa concisa usando Math.max:
	//return Math.max(0, (on + wait) - cap);

}




}
