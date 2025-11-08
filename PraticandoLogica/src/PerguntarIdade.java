package PraticandoLogica.src;
public class PerguntarIdade {
    

    public static int howOld(final String herOld){
        if( herOld == null || herOld.isEmpty()){
            throw new IllegalArgumentException("a frase não pode ser nula ou vazia.");
        }

        char firstCaracter = herOld.charAt(0);

        return Character.getNumericValue(firstCaracter);

    }
}
