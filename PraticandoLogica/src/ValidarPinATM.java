public class ValidarPinATM {
    

    /*
     * Validar se uma String é um código PIN válido de 4 ou dígistos.
     * Um Pin é Válido se:
     * 1. Tem comprimento exato de 4 ou 6 caracteres.
     * 2. Todos os caracteres são sígitos numéricos 
     * 
     * @param pin A string a ser validada como PIN.
     * @return true se o PIN for válido, false caso contrário.
     */


     public boolean validarPin(String pin){
        // 1. Verificar o comprimento
        int length = pin.length();
        if(length != 4 && length != 6){
            return false;
        }
        for(char c : pin.toCharArray()){
            if(!Character.isDigit(c)){
                return false; //encontrou um caractere que nã é dígito
            }
        }

        return true;
     }
}
