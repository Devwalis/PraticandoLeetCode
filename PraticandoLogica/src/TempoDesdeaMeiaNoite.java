public class TempoDesdeaMeiaNoite{

/*
	Converter horas, minutos e segundos decorridos desde a meia-noite para milissegundos.
	


	@param h horas decorridaas desde a meia-noite (0 a 23)
	@param m minutos decorridos desde a meia-noite (0 a 59)
	@param s Segundos decorridos desde a meia-noite (0 a 59)
	@return 0 tempo total decorrido desde a meia noite em milissegundos
*/
public int horas(int h, int m, int s){
	

	 // 1 hora possui 3.600.milissegundos (60 min * 60 seg * 1000 ms)
	// 1 minuto possui 60.000 milisegundos (60 seg * 1000 ms)
	// 1 segundo possui 1.000 milissegundos

	// Multiplica-se cada unidade de tempo para obter os milissegundos e soma-se o total
	
	return (h * 3600000) + (m * 60000) + (s * 1000);
	
	
	}


	public static void main(String[] args) {
		Clock clock = new Clock();
	
	 // teste com exemplo do anunciado (h = 0, m = 1, s = 1) 

	System.out.println("h = 0, m = 1, s= 1 -> " + clock.horas(0 , 1,  1));
 
