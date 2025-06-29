package solvecode;

public class UnaryOperatorClass {
    public static void main(String[] args) {
        int i =10;
        int j =i++ + i++ + --i + ++i + ++i;
        System.out.println(i);
        System.out.println(j);
    }
}
