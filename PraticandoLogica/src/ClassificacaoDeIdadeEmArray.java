public class ClassificacaoDeIdadeEmArray{
		
		public static int SomaIdadesExtremas(int[] arr){
	
		//Validação de entrada 

		if(arr == null || arr.length < 2){
			return 0;
	}
		
	int sum = 0;
	int min = arr[0];
	int max = arr[0];
	
	for (int num : arr){
		sum += num;
		if(num < min) min = num;
		if(num > max) max = num;
	
	}


	

	}
		return sum - min - max;
		
		}
