public class MelhorNotaDaClasse{


	/*
	comparar a sua nota com a média da turma (incluindo a sua nota).
	@param pontosClasse um array de inteiros representando as notas dos seus colegas de turma
	@param minhaNota
	return true se a sua nota for maior que a média da turma, false caso contrário.

*/

public boolean notas(int[] pontosClasse, int minhaNota){
	int somarTodosPontos = 0;

	//Somar notas dos colegas

	for(int nota : pontosClasse){
		sumOfAllPoints += nota;
}


	//Adicionar minha nota à soma total
	sumOfAllPoints += minhaNota;

	//Calcular o número total de alunos(colegas + eu)
	int totalEstudantes = pontosClasse.length + 1;


	// Calcula a média. é importante fazer a conversão para double
	// antes de divisão para obter um resultado de ponto flutuante
	double todosPontos = (double) sumOfAllPoints / totalEstudantes;


	//Retornar true se sua nota for estriamente maior que media 
	return minhaNota > todosPontos;


}


public static void main(String[] args){

MelhorMediaDaClasse media = new MelhorMediaDaClasse();

int[] notasDaClasse1 = {100, 40, 34, 57, 72, 57, 80};
int minhaNota1 = 75;

System.out.println("Minha nota 75, notas da turma [100, 40, 34, 57,26,72,57,88] -> melhor que a média?" + media.notas(notasDaClasse1, minhaNota1))
}
