public class InverteString {

    public static String inverter(String str){
        StringBuilder invertida = new StringBuilder();


        for (int i = str.length() -1; i>=0; i--){
            invertida.append(str.charAt(i));

        }
        return invertida.toString();

    }

    public static void main(String[] args) {
        String original = "Wolly";
        System.out.println("String invertida: " + inverter(original));
    }

    
}
