public class SerieSomaDosPrimeirosNtermos{
	
	public static String seriesSum(int n){
	
		if(n == 0){
			return "0.00";
	}
	double sum = 0.0;
	for(int i = 0; i < n; i++){
		sum += 1.0 / (3 * i + 1);
	}
	return String.format("%.2f", sum);

	}	
	
	
}
