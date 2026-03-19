public class LowestNum{
    public static void main(String args[]){
        int ages[] = {6,12,23,14,54,9,};
        int length = ages.length;
        int lowestAge = ages[0];

        for(int age: ages){
            if(lowestAge>age){
                lowestAge = age;
            }
        }
        System.out.println(lowestAge);
    }
}