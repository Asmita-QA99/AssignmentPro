package SwapPackage;

public class SwapValueUsingThirdV {
    public static void main(String[] args) {

        int i = 10;
        int j = 7;

        //Before swapping variable
        System.out.println(i);
        System.out.println(j);

       //After swapping variable

        int temp = i;   //now temp = 10;
        i = j;          //now i=7
        j = temp;       //now j=10

       //After swapping variable

        System.out.println(i);
        System.out.println(j);


    }

}
