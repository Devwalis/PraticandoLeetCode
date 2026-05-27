public class VerificarValorDentroDoArray{
		

	/*
	Verificar se um array de Objeto (que podem ser números ou strings) contém um valor específico 
	
	@param a 0 array de objetos a ser pesquisado.
	@param x 0 valor a ser procurado no array.
	@return true se o array contiver o valor, false caso contrário.



*/	

	public boolean check(Object[] a, Object x){
	
	//Iterar sobre cada elemento do array
	
	for (Object element : a){
	// Compara o elemento atual com o valor x
	//Usamos equals() para comparação de objetos, pois '=='compara refencias.
	if(element.equals(x)){
		return true; //Encontrou o valor, return True imediatamente
}
	}
	return false;
	
	}
}
