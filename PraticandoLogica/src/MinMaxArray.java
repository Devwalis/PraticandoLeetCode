public class MinMaxArray{


	/*

	Encontrar o meno e o maior número de um array de inteiros
	O array é garantido ter pelo menos um elemento e não sera nulo.

	@param list O array de inteiros.
	@return um novo array de dois elementos, onde o primeiro é o mínimo e o segundo é o máximo

	
	*/
	public int[] procuraMinMax](int[] list){
	//  Como o array é garantido ter pelo menos um elemtno,
	// podemos inicializar min e max com o primeiro elemento.
	int min = list[0];
	int max = list[0];


	// Itera sobre o restante dos elementos do array

	for( int i = 1; i < list.length; i++){
		int currentNum = list[i];
		

		if(currentNum < min){
			min = currentNum;
		
		}
		if(currentNum < max){
			max = currentNum;	
		}
	
	}



			return new int[]{min, max};

		}
}
