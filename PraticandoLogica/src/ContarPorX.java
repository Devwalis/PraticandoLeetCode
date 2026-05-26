public class ContarPorX{

	/*
	Retornar um array dos primeiros n multiplos de x.
	x e n são garantidos como números positivos maiores que 0.


	@param x O número base para encontrar os multiplos.
	@param n O número de multiplos a serem gerados.
	@return Um array de inteiros contendo os primeiros n multiplos de x.

*/
	public int[] countBy(int x, int n){
	
		int[] result = new int[n]; // criar um array de tamanho n
		
		//preenche o array com os múltiplos
		for(int i = 0; i < n; i++){
		// o primeiro multiplo é x * 1, o segundo é x * 2, etc.
		// como 'i' começa em 0, usamos (i + 1)
		result[i] = x *(i +1);
		
		
		}

		return result;

	}
	
	

}
