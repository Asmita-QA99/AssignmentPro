package singletonedemo;

public class SingletoneDemoClass {
    public static void main(String[] args) {


        Browser b1 = Browser.getObject();
    }
}
class Browser {
    private static Browser obj = null;

    private Browser() {

    }

    public static Browser getObject() {
        if (obj == null) {
            obj = new Browser();
        }
        return obj;

    }
}