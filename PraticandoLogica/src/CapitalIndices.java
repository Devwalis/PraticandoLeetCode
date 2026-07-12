public class CapitalIndices{
	

	public static List<Integer> getCapitalIndices(String word){
		return IntStream.range(O, word.length())
			.filter(i -> Charater.isUpperCase(word.charAt(i)))
			.boxed()
			.toList();

	
	}
	
	}
