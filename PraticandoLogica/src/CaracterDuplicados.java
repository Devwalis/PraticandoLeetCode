

import java.lang.StringBuilder;

public class CaracterDuplicados{

/*
Duplicar cada caractere em uma String.
@param str A string de entrada.
@return uma nova string onde cada caractere da string original
*/
public String duplicateChars(String str){


	if(str== null || str.isEmpty()){
	return str;
}
	StringBuilder resultBuilder = new StringBuilder();
	
	//Itera sobre cada caractere da string
	for (char c : str.toCharArray()){
	resultBuilder.append(c);// adiciona o caractere a primeira vez
	resultBuilder.append(c); //adiciona o caractere a segunda vez

}

return resultBuilder.toString();

}


}
