public class CodeupCrypt {
    public static double version;

    public static String hashPassword(String password){
        String hash = "";

        for(char character : password.toCharArray()){
            switch(character){
                case 'A', 'a':
                    hash += 4;
                    break;
                case 'O', 'o':
                    hash += 0;
                    break;
                case 'I', 'i':
                    hash += 1;
                    break;
                case 'E', 'e':
                    hash += 3;
                    break;
                case 'U', 'u':
                    hash += 9;
                    break;
                default:
                    hash += character;
            }
        }

        return hash;
    }

    public static boolean checkPassword(String password, String hash){
        return hash.equals(hashPassword(password));
    }

}
