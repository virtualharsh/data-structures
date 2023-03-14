// find whether given character is vowel or consonant

class Alphabet{
    public static String getType(Character c) {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return "Vowel";
        }else{
            return "Consonant";
        }
    }
}

public class Driver7 {
    public static void main(String[] args) {
        System.out.println(Alphabet.getType('a'));
    }
}
