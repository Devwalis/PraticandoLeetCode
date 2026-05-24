public class ClassificacaoDeIdade{


/*
Classifica uma idade em "childre", "young man" ou "old man".

@param age A idade ser classificada
@return Uma String reprensentando a categoria da idade

*/
public String oldYoung(final int age){
	if(age < 16){
		return "children";
	
	}else if(age < 50){// age >= 16 e age < 50
		return "young man";

	}else{ // age >= 50
		return "old man";


	}


}

/*Exemplo adicional de oddEven como mencionado no enunciado */

public String oddEven(final int n)
{
	if(n % 2 == 1){
		return "odd number";
	}else{
		return "even number";
	}

}
}
