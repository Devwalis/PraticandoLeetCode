public class InverterCaso{
/*
Inverter o caso de cada letra em uma String.
Letras minúsculas se tornam maiúsculas e vice-versa.
Caracters não alfabéticos permanecem inalterados.

@param str  A string de entrada.
@return Uma nova String com o caso das letras alternado.



*/
public String ParaAlternarCaso(String str){
	StringBuilder resultBuilder = new StringBuilder();

	for(char c : str.toCharArray()){
		if(Character.isLoweCase(c)){
			resultBuilder.append(Character.toUpperCase(c));
		
			}else if (Character.isUpperCase(c)){
				resultBuilder.append(Character.toLowerCase(c));

			}else{
				//Caracteres que não são letras (numeros, espaços, pontuação) permanecem os mesmos
				resultBuilder.append(c)			
	}
}
		return resultBuilder.toString();
}
}

