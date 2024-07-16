package main;

public class Reverse implements Operations {

    @Override
    public String trial(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}
