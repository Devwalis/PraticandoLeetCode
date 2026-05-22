public class PedraPapeleTesoura{

		/*
	

	@param player1 A  jogada do jogador 1.
	@param player2 A jogada do jogador 2.
	@return Uma String indicando o vencedor ("Player 1 won!", "player 2 won",ou draw!").


	*/
	
	public String rps(String player1, String player2){
		// Verificar empate

		if(player1.equals(player2)){
			return "Draw!";
		
	
	}
	//2 Verificar vitorias do jogador 1
	//pedra rock vence Tesoura (scissors)
	if(player1.equals("rock") && player2.equals("scissors)){
		return "player 1 won!";

	}
	
	// Tesoura scissors vence papel (paper)
	if(player1.equals("scisors")&& player2.equals("paper")){
		return "player 1 won";
	
	}
	if(player1.equals("paper") && player2.equals("rock")){
		
		return "player 1 won";
	
}
	return "player 2 won ";
			
	}
}
