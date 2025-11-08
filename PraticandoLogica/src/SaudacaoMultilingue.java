package PraticandoLogica.src;

import java.util.HashMap;
import java.util.Map;

public class SaudacaoMultilingue {

    //Banco de dados estático e final para armazenar as saudações
    private static final Map<String, String> GREETINGS_DB;


    //Blooco estático para inicializar o mapa uma única vez
    static {
        GREETINGS_DB = new HashMap<>();
        GREETINGS_DB.put("english", "Welcome");
        GREETINGS_DB.put("czech", "Vitejte");
        GREETINGS_DB.put("danish", "Velkomst");
        GREETINGS_DB.put("dutch", "Welkom");
        GREETINGS_DB.put("estonian", "Tere tulemast");
        GREETINGS_DB.put("finnish", "Tervetuloa");
        GREETINGS_DB.put("flemish", "Welgekomen");
        GREETINGS_DB.put("french", "Bienvenue");
        GREETINGS_DB.put("german", "Willkommen");
        GREETINGS_DB.put("irish", "Failte");
        GREETINGS_DB.put("italian", "Benvenuto");
        GREETINGS_DB.put("latvian", "Gaidits");
        GREETINGS_DB.put("lithuanian", "Laukiamas");
        GREETINGS_DB.put("polish", "Witamy");
        GREETINGS_DB.put("spanish", "Bienvenido");
        GREETINGS_DB.put("swedish", "Valkommen");
        GREETINGS_DB.put("welsh", "Croeso");
    }


    /*
     * Retorna uma saudação personalizada com base no idioma fornecido.
     * Se o idioma não estiver no "banco de dados" ou for uma entrada inválida,
     * retorne a saudação padrão em Inglês ("Welcome")
     * 
     * 
     * @Param language o Idioma para o qual a saudação é desejada
     * @return A Saudação no idioma especifiço ou "Welcome se ao for encontrado"
     */

     public String greet(String language){
        return GREETINGS_DB.getOrDefault(language, "Welcome");
     }

    
}
