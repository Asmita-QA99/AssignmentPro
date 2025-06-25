package SwapPackage;

public class SwapValue {
    public static void main(String[] args) {
        int i = 10;
        int j = 7;
     //Before swapping the variable value

        System.out.println(i);
        System.out.println(j);

        i  = i + j;    //i = 10+7=17
        j = i - j;    //j = 17-7=10
        i = i - j;     //i = 17-10=7

     //After swapping the variable value

        System.out.println(i);
        System.out.println(j);


    }


}
