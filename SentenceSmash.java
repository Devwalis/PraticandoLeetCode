public class SentenceSmash{

    public String smash(String[] words){

        return String.join(" ", words);

    }

    public static void main(String[] args){
        SentenceSmash smashs = new SentenceSmash();



        System.out.println(smashs.smash(new String[]{"hello", "world", "this", "is", "great"}));
        System.out.println(smashs.smash(new String[]{"name", "you", "is"}));
    }



           
    

 

}