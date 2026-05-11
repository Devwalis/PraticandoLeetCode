public class AntiTroll{
/*
Remover todas as vogais (a, e, i , o ,u, A, E , I , O ,U) de uma String.
A letra 'y' NÃO É considerada uma vogal para este problema.


@param str A string de entrada (comentario do troll)
@return uma nova String com todas as vogais removidas.


*/
public String disemvowel(String str){
// Expressão regular que corresponde a todas as vogais (maiusculas e minusculas)
// A letra 'y' é explicitamente excluída da regex


String regex = "[aeiouAEIOU]"


return str.replaceall(regex,"");

}



}
