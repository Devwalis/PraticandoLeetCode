public class ContarPositivosESomarNegativos{
	public static int[] contarPositivosSomarNegativo(int[] input){
		//Caso entrada seja nula ou vazia, retornar array vazio
	
	if(input == null || input.length == 0){
		return new int[0];
	
	}
	int countPositives = 0;
	int sumNegatives = 0;

	for (int num : input){
		if(num > 0){
			countPositives++;
	
	}else if (num < 0){
		sumNegatives += num;
}
	// zero é ignorado
	}
		return new int[]{countPositives, sumNegatives};
	}
	}
