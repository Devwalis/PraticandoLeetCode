public class EncontrarAgulhaNoPalheiro{
	public static String procuraAgulha(Object[] toque){
		for(int i = 0; i < toque.length; i++){
			if("agulha".equals(toque[i])){
				return "achamos a posição da agulha na posição " + 1;

	}
	}	
	return "agulha não encontrada";
}
	
	}
