package com.example.empty;

public class Calc {
    public int plus(int a, int b) {
        int c = a + b;
        return c;
    }

    public int div(int a, int b) {
        if (b == 0){
            return 0;
        } else {
            int c = a / b;
            return c;    
        }
    }
}
