package String;
public class Length_String {
    public static void main(String[] args) {
        String st = "Hello Mohit Yadav";
        int count = 0;
        for(int i = 0;i<st.length();i++){
            if(st.charAt(i) == ' '){
                continue;
            }
            count++;
        }
        System.out.println("Length ->" + count);
    }
}
