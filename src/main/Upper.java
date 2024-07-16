package main;

public class Upper implements Operations {

    @Override
    public String trial(String str) {
        return str.toUpperCase();
    }
}
