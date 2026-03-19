package string;

public class CompareString {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hello";

        boolean equal = true;

        if(s1.length() != s2.length()){
            equal = false;
        } else {

            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    equal = false;
                    break;
                }
            }

        }

        if(equal)
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");
    }
}


