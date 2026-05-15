public class StringTerminaCOm{
/*
Verificar se a string principal termina com a string de sufixo fornecida


@param str A String principal
@param ending a string ser verificada no final da string principal
@return true se a string principal termina com a string de sufixo, false caso contrário

*/

	public boolean solution(String str, String ending){

		//O metodo endsWith() da classe String já faz exatamente o que é pedido.

		return str.endsWith(ending);

}

	public static void main(String[] args){
		StringEndsWith checker = new StringEndsWith();


		System.out.println("\"abc\", \"bc\" -> " + checker.solution("abc", "bc"));

