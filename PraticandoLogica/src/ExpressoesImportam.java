public class ExpressoesImportam{
	/*

	Encontrar o maior valor possível inserindo +,  * e () entre três inteiros fornecidos.
	
	
	@param a O primeiro número inteiro positivo (1 a 10)
	@param b O segundo número inteiro positivo (1 a 10)
	@param c O terceiro número inteiro positivo (1 a 10)
	


*/	
		

		public int expressao(int a, int b, int c){
	//1. calcular todas as 6 possíveis variações de posicionamento de operadores e parênteses

	int r1 = a + b + c;
	int r2 = a * b *c;
	int r3 = a * (b + c);
	int r4 = a + ( b * c );
	int r5 = (a + b) * c;	
	int r6 = a * b + c;
	
	// 2. Define o primerio resultado como o valor máximo temporário
	int max = r1;

	// 3. Compara sequencialmente para encontrar o maior número absolutoenre váriações
	if(r2 > max){
		max = r2;
	}
	if(r3 > max){
		max = r3;
	}
	
	}
	if(r4 > max){
		max = r4;
	}
	if(r5 > max){
		max = r5;

	}
	if (r6 > max){
		max = r6; 
	}

	// 4 Retorna o maior resultado obtido
	
return max;
	

}	


